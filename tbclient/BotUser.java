package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class BotUser extends Message {
    public static final String DEFAULT_BOT_AVATAR = "";
    public static final String DEFAULT_ROLE_TYPE = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bot_avatar;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer dialogue_user_num;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer online_status;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pa_type;

    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double rate;

    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer robot_version;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String role_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<BotTags> tags;
    public static final Integer DEFAULT_ONLINE_STATUS = 0;
    public static final Integer DEFAULT_PA_TYPE = 0;
    public static final Integer DEFAULT_DIALOGUE_USER_NUM = 0;
    public static final Double DEFAULT_RATE = Double.valueOf(0.0d);
    public static final List<BotTags> DEFAULT_TAGS = Collections.emptyList();
    public static final Integer DEFAULT_ROBOT_VERSION = 0;

    public static final class Builder extends Message.Builder<BotUser> {
        public String bot_avatar;
        public Integer dialogue_user_num;
        public Integer online_status;
        public Integer pa_type;
        public Double rate;
        public Integer robot_version;
        public String role_type;
        public List<BotTags> tags;

        public Builder() {
        }

        public Builder(BotUser botUser) {
            super(botUser);
            if (botUser == null) {
                return;
            }
            this.online_status = botUser.online_status;
            this.bot_avatar = botUser.bot_avatar;
            this.pa_type = botUser.pa_type;
            this.dialogue_user_num = botUser.dialogue_user_num;
            this.rate = botUser.rate;
            this.role_type = botUser.role_type;
            this.tags = Message.copyOf(botUser.tags);
            this.robot_version = botUser.robot_version;
        }

        @Override // com.squareup.wire.Message.Builder
        public BotUser build(boolean z) {
            return new BotUser(this, z);
        }
    }

    public BotUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.online_status;
            if (num == null) {
                this.online_status = DEFAULT_ONLINE_STATUS;
            } else {
                this.online_status = num;
            }
            String str = builder.bot_avatar;
            if (str == null) {
                this.bot_avatar = "";
            } else {
                this.bot_avatar = str;
            }
            Integer num2 = builder.pa_type;
            if (num2 == null) {
                this.pa_type = DEFAULT_PA_TYPE;
            } else {
                this.pa_type = num2;
            }
            Integer num3 = builder.dialogue_user_num;
            if (num3 == null) {
                this.dialogue_user_num = DEFAULT_DIALOGUE_USER_NUM;
            } else {
                this.dialogue_user_num = num3;
            }
            Double d = builder.rate;
            if (d == null) {
                this.rate = DEFAULT_RATE;
            } else {
                this.rate = d;
            }
            String str2 = builder.role_type;
            if (str2 == null) {
                this.role_type = "";
            } else {
                this.role_type = str2;
            }
            List<BotTags> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.robot_version;
            if (num4 == null) {
                this.robot_version = DEFAULT_ROBOT_VERSION;
                return;
            } else {
                this.robot_version = num4;
                return;
            }
        }
        this.online_status = builder.online_status;
        this.bot_avatar = builder.bot_avatar;
        this.pa_type = builder.pa_type;
        this.dialogue_user_num = builder.dialogue_user_num;
        this.rate = builder.rate;
        this.role_type = builder.role_type;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.robot_version = builder.robot_version;
    }
}