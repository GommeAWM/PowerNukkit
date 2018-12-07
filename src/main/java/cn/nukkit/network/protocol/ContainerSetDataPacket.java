package cn.nukkit.network.protocol;

/**
 * @author MagicDroidX
 * Nukkit Project
 */
public class ContainerSetDataPacket extends DataPacket {

    public static final int PROPERTY_FURNACE_TICK_COUNT = 0;
    public static final int PROPERTY_FURNACE_LIT_TIME = 1;
    public static final int PROPERTY_FURNACE_LIT_DURATION = 2;
    public static final int PROPERTY_UNKNOWN = 3;
    public static final int PROPERTY_FURNACE_FUEL_AUX = 4;

    public static final int PROPERTY_BREWING_STAND_BREW_TIME = 0;
    public static final int PROPERTY_BREWING_STAND_FUEL_AMOUNT = 1;
    public static final int PROPERTY_BREWING_STAND_FUEL_TOTAL = 2;

    @Override
    public byte pid() {
        return ProtocolInfo.CONTAINER_SET_DATA_PACKET;
    }

    public int windowId;
    public int property;
    public int value;

    @Override
    public void decode() {
    }

    @Override
    public void encode() {
        this.reset();
        this.putByte((byte) this.windowId);
        this.putVarInt(this.property);
        this.putVarInt(this.value);
    }
}
