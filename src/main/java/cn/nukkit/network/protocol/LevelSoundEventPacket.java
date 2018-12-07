package cn.nukkit.network.protocol;


import cn.nukkit.math.Vector3f;

public class LevelSoundEventPacket extends DataPacket {

	public static final int SOUND_ITEM_USE_ON = 0;
	public static final int SOUND_HIT = 1;
	public static final int SOUND_STEP = 2;
	public static final int SOUND_FLY = 3;
	public static final int SOUND_JUMP = 4;
	public static final int SOUND_BREAK = 5;
	public static final int SOUND_PLACE = 6;
	public static final int SOUND_HEAVY_STEP = 7;
	public static final int SOUND_GALLOP = 8;
	public static final int SOUND_FALL = 9;
	public static final int SOUND_AMBIENT = 10;
	public static final int SOUND_AMBIENT_BABY = 11;
	public static final int SOUND_AMBIENT_IN_WATER = 12;
	public static final int SOUND_BREATHE = 13;
	public static final int SOUND_DEATH = 14;
	public static final int SOUND_DEATH_IN_WATER = 15;
	public static final int SOUND_DEATH_TO_ZOMBIE = 16;
	public static final int SOUND_HURT = 17;
	public static final int SOUND_HURT_IN_WATER = 18;
	public static final int SOUND_MAD = 19;
	public static final int SOUND_BOOST = 20;
	public static final int SOUND_BOW = 21;
	public static final int SOUND_SQUISH_BIG = 22;
	public static final int SOUND_SQUISH_SMALL = 23;
	public static final int SOUND_FALL_BIG = 24;
	public static final int SOUND_FALL_SMALL = 25;
	public static final int SOUND_SPLASH = 26;
	public static final int SOUND_FIZZ = 27;
	public static final int SOUND_FLAP = 28;
	public static final int SOUND_SWIM = 29;
	public static final int SOUND_DRINK = 30;
	public static final int SOUND_EAT = 31;
	public static final int SOUND_TAKEOFF = 32;
	public static final int SOUND_SHAKE = 33;
	public static final int SOUND_PLOP = 34;
	public static final int SOUND_LAND = 35;
	public static final int SOUND_SADDLE = 36;
	public static final int SOUND_ARMOR = 37;
	public static final int SOUND_MOB_ARMOR_STAND_PLACE = 38;
	public static final int SOUND_ADD_CHEST = 39;
	public static final int SOUND_THROW = 40;
	public static final int SOUND_ATTACK = 41;
	public static final int SOUND_ATTACK_NODAMAGE = 42;
	public static final int SOUND_ATTACK_STRONG = 43;
	public static final int SOUND_WARN = 44;
	public static final int SOUND_SHEAR = 45;
	public static final int SOUND_MILK = 46;
	public static final int SOUND_THUNDER = 47;
	public static final int SOUND_EXPLODE = 48;
	public static final int SOUND_FIRE = 49;
	public static final int SOUND_IGNITE = 50;
	public static final int SOUND_FUSE = 51;
	public static final int SOUND_STARE = 52;
	public static final int SOUND_SPAWN = 53;
	public static final int SOUND_SHOOT = 54;
	public static final int SOUND_BREAK_BLOCK = 55;
	public static final int SOUND_LAUNCH = 56;
	public static final int SOUND_BLAST = 57;
	public static final int SOUND_LARGE_BLAST = 58;
	public static final int SOUND_TWINKLE = 59;
	public static final int SOUND_REMEDY = 60;
	public static final int SOUND_UNFECT = 61;
	public static final int SOUND_LEVELUP = 62;
	public static final int SOUND_BOW_HIT = 63;
	public static final int SOUND_BULLET_HIT = 64;
	public static final int SOUND_EXTINGUISH_FIRE = 65;
	public static final int SOUND_ITEM_FIZZ = 66;
	public static final int SOUND_CHEST_OPEN = 67;
	public static final int SOUND_CHEST_CLOSED = 68;
	public static final int SOUND_SHULKERBOX_OPEN = 69;
	public static final int SOUND_SHULKERBOX_CLOSED = 70;
	public static final int SOUND_ENDERCHEST_OPEN = 71;
	public static final int SOUND_ENDERCHEST_CLOSED = 72;
	public static final int SOUND_POWER_ON = 73;
	public static final int SOUND_POWER_OFF = 74;
	public static final int SOUND_ATTACH = 75;
	public static final int SOUND_DETACH = 76;
	public static final int SOUND_DENY = 77;
	public static final int SOUND_TRIPOD = 78;
	public static final int SOUND_POP = 79;
	public static final int SOUND_DROP_SLOT = 80;
	public static final int SOUND_NOTE = 81;
	public static final int SOUND_THORNS = 82;
	public static final int SOUND_PISTON_IN = 83;
	public static final int SOUND_PISTON_OUT = 84;
	public static final int SOUND_PORTAL = 85;
	public static final int SOUND_WATER = 86;
	public static final int SOUND_LAVA_POP = 87;
	public static final int SOUND_LAVA = 88;
	public static final int SOUND_BURP = 89;
	public static final int SOUND_BUCKET_FILL_WATER = 90;
	public static final int SOUND_BUCKET_FILL_LAVA = 91;
	public static final int SOUND_BUCKET_EMPTY_WATER = 92;
	public static final int SOUND_BUCKET_EMPTY_LAVA = 93;
	public static final int SOUND_ARMOR_EQUIP_CHAIN = 94;
	public static final int SOUND_ARMOR_EQUIP_DIAMOND = 95;
	public static final int SOUND_ARMOR_EQUIP_GENERIC = 96;
	public static final int SOUND_ARMOR_EQUIP_GOLD = 97;
	public static final int SOUND_ARMOR_EQUIP_IRON = 98;
	public static final int SOUND_ARMOR_EQUIP_LEATHER = 99;
	public static final int SOUND_ARMOR_EQUIP_ELYTRA = 100;
	public static final int SOUND_RECORD_13 = 101;
	public static final int SOUND_RECORD_CAT = 102;
	public static final int SOUND_RECORD_BLOCKS = 103;
	public static final int SOUND_RECORD_CHIRP = 104;
	public static final int SOUND_RECORD_FAR = 105;
	public static final int SOUND_RECORD_MALL = 106;
	public static final int SOUND_RECORD_MELLOHI = 107;
	public static final int SOUND_RECORD_STAL = 108;
	public static final int SOUND_RECORD_STRAD = 109;
	public static final int SOUND_RECORD_WARD = 110;
	public static final int SOUND_RECORD_11 = 111;
	public static final int SOUND_RECORD_WAIT = 112;
	public static final int SOUND_GUARDIAN_FLOP = 114;
	public static final int SOUND_ELDERGUARDIAN_CURSE = 115;
	public static final int SOUND_MOB_WARNING = 116;
	public static final int SOUND_MOB_WARNING_BABY = 117;
	public static final int SOUND_TELEPORT = 118;
	public static final int SOUND_SHULKER_OPEN = 119;
	public static final int SOUND_SHULKER_CLOSE = 120;
	public static final int SOUND_HAGGLE = 121;
	public static final int SOUND_HAGGLE_YES = 122;
	public static final int SOUND_HAGGLE_NO = 123;
	public static final int SOUND_HAGGLE_IDLE = 124;
	public static final int SOUND_CHORUSGROW = 125;
	public static final int SOUND_CHORUSDEATH = 126;
	public static final int SOUND_GLASS = 127;
	public static final int SOUND_POTION_BREWED = 128;
	public static final int SOUND_CAST_SPELL = 129;
	public static final int SOUND_PREPARE_ATTACK = 130;
	public static final int SOUND_PREPARE_SUMMON = 131;
	public static final int SOUND_PREPARE_WOLOLO = 132;
	public static final int SOUND_FANG = 133;
	public static final int SOUND_CHARGE = 134;
	public static final int SOUND_CAMERA_TAKE_PICTURE = 135;
	public static final int SOUND_LEASHKNOT_PLACE = 136;
	public static final int SOUND_LEASHKNOT_BREAK = 137;
	public static final int SOUND_GROWL = 138;
	public static final int SOUND_WHINE = 139;
	public static final int SOUND_PANT = 140;
	public static final int SOUND_PURR = 141;
	public static final int SOUND_PURREOW = 142;
	public static final int SOUND_DEATH_MIN_VOLUME = 143;
	public static final int SOUND_DEATH_MID_VOLUME = 144;
	public static final int SOUND_IMITATE_BLAZE = 145;
	public static final int SOUND_IMITATE_CAVE_SPIDER = 146;
	public static final int SOUND_IMITATE_CREEPER = 147;
	public static final int SOUND_IMITATE_ELDER_GUARDIAN = 148;
	public static final int SOUND_IMITATE_ENDER_DRAGON = 149;
	public static final int SOUND_IMITATE_ENDERMAN = 150;
	public static final int SOUND_IMITATE_EVOCATION_ILLAGER = 152;
	public static final int SOUND_IMITATE_GHAST = 153;
	public static final int SOUND_IMITATE_HUSK = 154;
	public static final int SOUND_IMITATE_ILLUSION_ILLAGER = 155;
	public static final int SOUND_IMITATE_MAGMA_CUBE = 156;
	public static final int SOUND_IMITATE_POLAR_BEAR = 157;
	public static final int SOUND_IMITATE_SHULKER = 158;
	public static final int SOUND_IMITATE_SILVERFISH = 159;
	public static final int SOUND_IMITATE_SKELETON = 160;
	public static final int SOUND_IMITATE_SLIME = 161;
	public static final int SOUND_IMITATE_SPIDER = 162;
	public static final int SOUND_IMITATE_STRAY = 163;
	public static final int SOUND_IMITATE_VEX = 164;
	public static final int SOUND_IMITATE_VINDICATION_ILLAGER = 165;
	public static final int SOUND_IMITATE_WITCH = 166;
	public static final int SOUND_IMITATE_WITHER = 167;
	public static final int SOUND_IMITATE_WITHER_SKELETON = 168;
	public static final int SOUND_IMITATE_WOLF = 169;
	public static final int SOUND_IMITATE_ZOMBIE = 170;
	public static final int SOUND_IMITATE_ZOMBIE_PIGMAN = 171;
	public static final int SOUND_IMITATE_ZOMBIE_VILLAGER = 172;
	public static final int SOUND_BLOCK_END_PORTAL_FRAME_FILL = 173;
	public static final int SOUND_BLOCK_END_PORTAL_SPAWN = 174;
	public static final int SOUND_RANDOM_ANVIL_USE = 175;
	public static final int SOUND_BOTTLE_DRAGONBREATH = 176;
	public static final int SOUND_PORTAL_TRAVEL = 177;
	public static final int SOUND_DEFAULT = 178;
	public static final int SOUND_UNDEFINED = 179;

    public int sound;
    public float x;
    public float y;
    public float z;
    public int extraData = -1;
    public int pitch = 1;
    public boolean isBabyMob;
    public boolean isGlobal;

    @Override
    public void decode() {
        this.sound = this.getByte();
        Vector3f v = this.getVector3f();
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.extraData = this.getVarInt();
        this.pitch = this.getVarInt();
        this.isBabyMob = this.getBoolean();
        this.isGlobal = this.getBoolean();
    }

    @Override
    public void encode() {
        this.reset();
        this.putByte((byte) this.sound);
        this.putVector3f(this.x, this.y, this.z);
        this.putVarInt(this.extraData);
        this.putVarInt(this.pitch);
        this.putBoolean(this.isBabyMob);
        this.putBoolean(this.isGlobal);
    }

    @Override
    public byte pid() {
        return ProtocolInfo.LEVEL_SOUND_EVENT_PACKET;
    }
}
