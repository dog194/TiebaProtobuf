package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class GameDetail extends Message {
    public static final String DEFAULT_BOOKED_NUM = "";
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final String DEFAULT_CID = "";
    public static final String DEFAULT_COMPANY = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DOWNLOAD_NUM = "";
    public static final String DEFAULT_GAME_ICON = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_LABEL = "";
    public static final String DEFAULT_REC_TXT = "";

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String booked_num;

    @ProtoField(tag = 18)
    public final GameBookedToast booked_toast;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String button_name;

    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer card_type;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String cid;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String company;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String download_num;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String game_icon;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_name;

    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> game_tags;

    @ProtoField(tag = 15)
    public final Media head_img;

    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer is_show_button;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String label;

    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 12)
    public final PkgInfo pkg_info;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String rec_txt;

    @ProtoField(tag = 20)
    public final SidebarInfo sidebar_info;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer user_is_booked;
    public static final List<String> DEFAULT_GAME_TAGS = Collections.emptyList();
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_USER_IS_BOOKED = 0;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final Integer DEFAULT_IS_SHOW_BUTTON = 0;
    public static final Integer DEFAULT_CARD_TYPE = 0;

    public static final class Builder extends Message.Builder<GameDetail> {
        public String booked_num;
        public GameBookedToast booked_toast;
        public String button_name;
        public Integer card_type;
        public String cid;
        public String company;
        public String desc;
        public String download_num;
        public String game_icon;
        public String game_id;
        public String game_name;
        public List<String> game_tags;
        public Media head_img;
        public Integer is_show_button;
        public String jump_url;
        public String label;
        public List<FeedKV> log_param;
        public PkgInfo pkg_info;
        public String rec_txt;
        public SidebarInfo sidebar_info;
        public Integer type;
        public Integer user_is_booked;

        public Builder() {
        }

        public Builder(GameDetail gameDetail) {
            super(gameDetail);
            if (gameDetail == null) {
                return;
            }
            this.game_id = gameDetail.game_id;
            this.game_name = gameDetail.game_name;
            this.game_icon = gameDetail.game_icon;
            this.game_tags = Message.copyOf(gameDetail.game_tags);
            this.label = gameDetail.label;
            this.type = gameDetail.type;
            this.booked_num = gameDetail.booked_num;
            this.button_name = gameDetail.button_name;
            this.company = gameDetail.company;
            this.user_is_booked = gameDetail.user_is_booked;
            this.jump_url = gameDetail.jump_url;
            this.pkg_info = gameDetail.pkg_info;
            this.cid = gameDetail.cid;
            this.desc = gameDetail.desc;
            this.head_img = gameDetail.head_img;
            this.download_num = gameDetail.download_num;
            this.log_param = Message.copyOf(gameDetail.log_param);
            this.booked_toast = gameDetail.booked_toast;
            this.is_show_button = gameDetail.is_show_button;
            this.sidebar_info = gameDetail.sidebar_info;
            this.card_type = gameDetail.card_type;
            this.rec_txt = gameDetail.rec_txt;
        }

        @Override // com.squareup.wire.Message.Builder
        public GameDetail build(boolean z) {
            return new GameDetail(this, z);
        }
    }

    public GameDetail(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
            } else {
                this.game_id = str;
            }
            String str2 = builder.game_name;
            if (str2 == null) {
                this.game_name = "";
            } else {
                this.game_name = str2;
            }
            String str3 = builder.game_icon;
            if (str3 == null) {
                this.game_icon = "";
            } else {
                this.game_icon = str3;
            }
            List<String> list = builder.game_tags;
            if (list == null) {
                this.game_tags = DEFAULT_GAME_TAGS;
            } else {
                this.game_tags = Message.immutableCopyOf(list);
            }
            String str4 = builder.label;
            if (str4 == null) {
                this.label = "";
            } else {
                this.label = str4;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str5 = builder.booked_num;
            if (str5 == null) {
                this.booked_num = "";
            } else {
                this.booked_num = str5;
            }
            String str6 = builder.button_name;
            if (str6 == null) {
                this.button_name = "";
            } else {
                this.button_name = str6;
            }
            String str7 = builder.company;
            if (str7 == null) {
                this.company = "";
            } else {
                this.company = str7;
            }
            Integer num2 = builder.user_is_booked;
            if (num2 == null) {
                this.user_is_booked = DEFAULT_USER_IS_BOOKED;
            } else {
                this.user_is_booked = num2;
            }
            String str8 = builder.jump_url;
            if (str8 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str8;
            }
            this.pkg_info = builder.pkg_info;
            String str9 = builder.cid;
            if (str9 == null) {
                this.cid = "";
            } else {
                this.cid = str9;
            }
            String str10 = builder.desc;
            if (str10 == null) {
                this.desc = "";
            } else {
                this.desc = str10;
            }
            this.head_img = builder.head_img;
            String str11 = builder.download_num;
            if (str11 == null) {
                this.download_num = "";
            } else {
                this.download_num = str11;
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            this.booked_toast = builder.booked_toast;
            Integer num3 = builder.is_show_button;
            if (num3 == null) {
                this.is_show_button = DEFAULT_IS_SHOW_BUTTON;
            } else {
                this.is_show_button = num3;
            }
            this.sidebar_info = builder.sidebar_info;
            Integer num4 = builder.card_type;
            if (num4 == null) {
                this.card_type = DEFAULT_CARD_TYPE;
            } else {
                this.card_type = num4;
            }
            String str12 = builder.rec_txt;
            if (str12 == null) {
                this.rec_txt = "";
                return;
            } else {
                this.rec_txt = str12;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.game_name = builder.game_name;
        this.game_icon = builder.game_icon;
        this.game_tags = Message.immutableCopyOf(builder.game_tags);
        this.label = builder.label;
        this.type = builder.type;
        this.booked_num = builder.booked_num;
        this.button_name = builder.button_name;
        this.company = builder.company;
        this.user_is_booked = builder.user_is_booked;
        this.jump_url = builder.jump_url;
        this.pkg_info = builder.pkg_info;
        this.cid = builder.cid;
        this.desc = builder.desc;
        this.head_img = builder.head_img;
        this.download_num = builder.download_num;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.booked_toast = builder.booked_toast;
        this.is_show_button = builder.is_show_button;
        this.sidebar_info = builder.sidebar_info;
        this.card_type = builder.card_type;
        this.rec_txt = builder.rec_txt;
    }
}