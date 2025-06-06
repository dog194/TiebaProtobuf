package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AiChatBotInfo extends Message {
    public static final String DEFAULT_BACKGROUND_URL = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_INPUT_BOX_TEXT = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PROLOGUE = "";
    public static final String DEFAULT_ROLE_TYPE = "";
    public static final String DEFAULT_SEND_TEXT = "";
    public static final String DEFAULT_UK = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String background_url;

    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long bot_uid;

    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long dialogue_user_num;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String h5_url;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String input_box_text;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pa;

    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long plot_id;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String prologue;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String role_type;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String send_text;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String uk;
    public static final Long DEFAULT_PA = 0L;
    public static final Long DEFAULT_PLOT_ID = 0L;
    public static final Long DEFAULT_BOT_UID = 0L;
    public static final Long DEFAULT_DIALOGUE_USER_NUM = 0L;

    public static final class Builder extends Message.Builder<AiChatBotInfo> {
        public String background_url;
        public Long bot_uid;
        public Long dialogue_user_num;
        public String h5_url;
        public String input_box_text;
        public String name;
        public Long pa;
        public Long plot_id;
        public String portrait;
        public String prologue;
        public String role_type;
        public String send_text;
        public String uk;

        public Builder() {
        }

        public Builder(AiChatBotInfo aiChatBotInfo) {
            super(aiChatBotInfo);
            if (aiChatBotInfo == null) {
                return;
            }
            this.uk = aiChatBotInfo.uk;
            this.pa = aiChatBotInfo.pa;
            this.name = aiChatBotInfo.name;
            this.portrait = aiChatBotInfo.portrait;
            this.background_url = aiChatBotInfo.background_url;
            this.prologue = aiChatBotInfo.prologue;
            this.send_text = aiChatBotInfo.send_text;
            this.plot_id = aiChatBotInfo.plot_id;
            this.bot_uid = aiChatBotInfo.bot_uid;
            this.dialogue_user_num = aiChatBotInfo.dialogue_user_num;
            this.role_type = aiChatBotInfo.role_type;
            this.input_box_text = aiChatBotInfo.input_box_text;
            this.h5_url = aiChatBotInfo.h5_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public AiChatBotInfo build(boolean z) {
            return new AiChatBotInfo(this, z);
        }
    }

    public AiChatBotInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
            } else {
                this.uk = str;
            }
            Long l = builder.pa;
            if (l == null) {
                this.pa = DEFAULT_PA;
            } else {
                this.pa = l;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            String str4 = builder.background_url;
            if (str4 == null) {
                this.background_url = "";
            } else {
                this.background_url = str4;
            }
            String str5 = builder.prologue;
            if (str5 == null) {
                this.prologue = "";
            } else {
                this.prologue = str5;
            }
            String str6 = builder.send_text;
            if (str6 == null) {
                this.send_text = "";
            } else {
                this.send_text = str6;
            }
            Long l2 = builder.plot_id;
            if (l2 == null) {
                this.plot_id = DEFAULT_PLOT_ID;
            } else {
                this.plot_id = l2;
            }
            Long l3 = builder.bot_uid;
            if (l3 == null) {
                this.bot_uid = DEFAULT_BOT_UID;
            } else {
                this.bot_uid = l3;
            }
            Long l4 = builder.dialogue_user_num;
            if (l4 == null) {
                this.dialogue_user_num = DEFAULT_DIALOGUE_USER_NUM;
            } else {
                this.dialogue_user_num = l4;
            }
            String str7 = builder.role_type;
            if (str7 == null) {
                this.role_type = "";
            } else {
                this.role_type = str7;
            }
            String str8 = builder.input_box_text;
            if (str8 == null) {
                this.input_box_text = "";
            } else {
                this.input_box_text = str8;
            }
            String str9 = builder.h5_url;
            if (str9 == null) {
                this.h5_url = "";
                return;
            } else {
                this.h5_url = str9;
                return;
            }
        }
        this.uk = builder.uk;
        this.pa = builder.pa;
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.background_url = builder.background_url;
        this.prologue = builder.prologue;
        this.send_text = builder.send_text;
        this.plot_id = builder.plot_id;
        this.bot_uid = builder.bot_uid;
        this.dialogue_user_num = builder.dialogue_user_num;
        this.role_type = builder.role_type;
        this.input_box_text = builder.input_box_text;
        this.h5_url = builder.h5_url;
    }
}