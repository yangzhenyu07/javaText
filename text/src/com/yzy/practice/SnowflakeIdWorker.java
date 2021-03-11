package com.yzy.practice;

public class SnowflakeIdWorker {

	  /** ��ʼʱ��� */
    private final long twepoch = 1530051700000L;

    /** ����id��λ�� */
    private final long workerIdBits = 5L;

    /** ���ݱ�ʶid��λ�� */
    private final long datacenterIdBits = 5L;

    /** ���Ļ���id�������31 */
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits);

    /** �������ݱ�ʶid�������31 */
    private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

    /** ���е�λ�� */
    private final long sequenceBits = 12L;

    /** ����ID������12λ */
    private final long workerIdShift = sequenceBits;

    /** ���ݱ�ʶid������17λ */
    private final long datacenterIdShift = sequenceBits + workerIdBits;

    /** ʱ���������22λ*/
    private final long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;

    /** �������е����� */
    private final long sequenceMask = -1L ^ (-1L << sequenceBits);

    /** ��������ID(0~31) */
    private long workerId;

    /** ��������ID(0~31) */
    private long datacenterId;

    /** ����������(0~4095) */
    private long sequence = 0L;

    /** �ϴ�����ID��ʱ��� */
    private long lastTimestamp = -1L;

    /**
     * ���캯��
     * @param workerId ����ID (0~31)
     * @param datacenterId ��������ID (0~31)
     */
    public SnowflakeIdWorker(long workerId, long datacenterId) {
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    public static void main(String[] args) throws Exception {
    	
    	System.out.println(-1L << 5L);
    	System.out.println(-1L ^ (-1L << 5L));
    	SnowflakeIdWorker s = new SnowflakeIdWorker(-1245L,-4545L);
    	System.out.println(s.nextId());
	}
    /**
     * �����һ��ID (�÷������̰߳�ȫ��)
     * @return SnowflakeId
     * @throws Exception 
     */
    public synchronized long nextId() throws Exception {
        long timestamp = getCurrentTime();

        //�����ǰʱ��С����һ�����ɵ�ʱ�����˵��ϵͳʱ�ӻ��˹����׳��쳣
        if (timestamp < lastTimestamp) {
        	long res = lastTimestamp - timestamp;
            throw new Exception("�ز���ʱ��Ϊ��"+String.valueOf(res));
        }

        //�����ͬһʱ�����ɵģ�����к���������
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            //�������������
            if (sequence == 0) {
                //����µ�ʱ���
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {  //ʱ����ı䣬��������������
            sequence = 0L;
        }

        //�ϴ�����ID��ʱ���
        lastTimestamp = timestamp;

        //��λ��ͨ��������ƴ��һ�����64λ��ID
        return ((timestamp - twepoch) << timestampLeftShift) // ����ʱ���
                | (datacenterId << datacenterIdShift) // ������������
                | (workerId << workerIdShift) // �������ID
                | sequence; // ���к�
    }

    /**
     *����µ�ʱ���
     * @param lastTimestamp �ϴ�����ID��ʱ���
     * @return ��ǰʱ���
     */
    protected long tilNextMillis(long lastTimestamp) {
        long timestamp = getCurrentTime();
        // ���ǵ�ǰʱ�������һ�ε�1ʱ���һֱ������֪����ȡ�����µ�ʱ�䣨�ز����ʱ�䣩
        while (timestamp <= lastTimestamp) {
            timestamp = getCurrentTime();
        }
        return timestamp;
    }

    /**
     * ��ȡ��ǰʱ��
     * @return ��ǰʱ��(����)
     */
    protected long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
