package Hw.Tz;

public interface SuperEncoder {
    byte[] serialize(Object anyBean);
    Object deserialize(byte[] date);
}
