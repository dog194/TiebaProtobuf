package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PbContent extends Message {
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_CDN_SRC_ACTIVE = "";
    public static final String DEFAULT_DYNAMIC = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_IMGTYPE = "";
    public static final String DEFAULT_ITEM_FORUM_NAME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_ORIGIN_SRC = "";
    public static final String DEFAULT_PACKET_NAME = "";
    public static final String DEFAULT_PHONETYPE = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_QUERY_PREFIX = "";
    public static final String DEFAULT_QUERY_TEXT = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_STATIC = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
    public static final String DEFAULT_VOICE_MD5 = "";

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String _static;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String big_cdn_src;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_size;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String big_src;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bsize;

    @ProtoField(tag = 26, type = Message.Datatype.UINT32)
    public final Integer btn_type;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String c;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String cdn_src;

    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String cdn_src_active;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer count;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer during_time;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String dynamic;

    @ProtoField(tag = 24, type = Message.Datatype.UINT32)
    public final Integer e_type;

    @ProtoField(tag = 29)
    public final GraffitiInfo graffiti_info;

    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer height;

    @ProtoField(tag = 30)
    public final TogetherHi high_together;

    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String imgtype;

    @ProtoField(tag = 52, type = Message.Datatype.INT32)
    public final Integer is_bot;

    @ProtoField(tag = 34, type = Message.Datatype.UINT32)
    public final Integer is_long_pic;

    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer is_native_app;

    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer is_sub;

    @ProtoField(tag = 41)
    public final Item item;

    @ProtoField(tag = 39, type = Message.Datatype.STRING)
    public final String item_forum_name;

    @ProtoField(tag = 38, type = Message.Datatype.UINT64)
    public final Long item_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;

    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer link_type;

    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String media_subtitle;

    @ProtoField(tag = 33)
    public final MemeInfo meme_info;

    @ProtoField(tag = 23)
    public final NativeApp native_app;

    @ProtoField(tag = 27, type = Message.Datatype.UINT32)
    public final Integer origin_size;

    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String origin_src;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String packet_name;

    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String phonetype;

    @ProtoField(tag = 42, type = Message.Datatype.INT64)
    public final Long pic_id;

    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String query_prefix;

    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String query_text;

    @ProtoField(tag = 51, type = Message.Datatype.INT32)
    public final Integer search_type;

    @ProtoField(tag = 35, type = Message.Datatype.UINT32)
    public final Integer show_original_btn;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;

    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String target_scheme;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 45)
    public final TextPlugin text_plugin;

    @ProtoField(tag = 50)
    public final ThemeColorInfo theme_color;

    @ProtoField(tag = 40)
    public final TiebaPlusInfo tiebaplus_info;

    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String topic_special_icon;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

    @ProtoField(tag = 15, type = Message.Datatype.INT64)
    public final Long uid;

    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer url_type;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String voice_md5;

    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Integer DEFAULT_IS_SUB = 0;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_IS_NATIVE_APP = 0;
    public static final Integer DEFAULT_E_TYPE = 0;
    public static final Integer DEFAULT_BTN_TYPE = 0;
    public static final Integer DEFAULT_ORIGIN_SIZE = 0;
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_URL_TYPE = 0;
    public static final Integer DEFAULT_IS_LONG_PIC = 0;
    public static final Integer DEFAULT_SHOW_ORIGINAL_BTN = 0;
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final Long DEFAULT_PIC_ID = 0L;
    public static final Integer DEFAULT_LINK_TYPE = 0;
    public static final Integer DEFAULT_SEARCH_TYPE = 0;
    public static final Integer DEFAULT_IS_BOT = 0;

    public static final class Builder extends Message.Builder<PbContent> {
        public String _static;
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public Integer btn_type;
        public String c;
        public String cdn_src;
        public String cdn_src_active;
        public Integer count;
        public Integer during_time;
        public String dynamic;
        public Integer e_type;
        public GraffitiInfo graffiti_info;
        public Integer height;
        public TogetherHi high_together;
        public String icon;
        public String imgtype;
        public Integer is_bot;
        public Integer is_long_pic;
        public Integer is_native_app;
        public Integer is_sub;
        public Item item;
        public String item_forum_name;
        public Long item_id;
        public String link;
        public Integer link_type;
        public String media_subtitle;
        public MemeInfo meme_info;
        public NativeApp native_app;
        public Integer origin_size;
        public String origin_src;
        public String packet_name;
        public String phonetype;
        public Long pic_id;
        public String portrait;
        public String query_prefix;
        public String query_text;
        public Integer search_type;
        public Integer show_original_btn;
        public String src;
        public String target_scheme;
        public String text;
        public TextPlugin text_plugin;
        public ThemeColorInfo theme_color;
        public TiebaPlusInfo tiebaplus_info;
        public String topic_special_icon;
        public Integer type;
        public Long uid;
        public Integer url_type;
        public String voice_md5;
        public Integer width;

        public Builder() {
        }

        public Builder(PbContent pbContent) {
            super(pbContent);
            if (pbContent == null) {
                return;
            }
            this.type = pbContent.type;
            this.text = pbContent.text;
            this.link = pbContent.link;
            this.src = pbContent.src;
            this.bsize = pbContent.bsize;
            this.big_src = pbContent.big_src;
            this.big_size = pbContent.big_size;
            this.cdn_src = pbContent.cdn_src;
            this.big_cdn_src = pbContent.big_cdn_src;
            this.imgtype = pbContent.imgtype;
            this.c = pbContent.c;
            this.voice_md5 = pbContent.voice_md5;
            this.during_time = pbContent.during_time;
            this.is_sub = pbContent.is_sub;
            this.uid = pbContent.uid;
            this.dynamic = pbContent.dynamic;
            this._static = pbContent._static;
            this.width = pbContent.width;
            this.height = pbContent.height;
            this.packet_name = pbContent.packet_name;
            this.phonetype = pbContent.phonetype;
            this.is_native_app = pbContent.is_native_app;
            this.native_app = pbContent.native_app;
            this.e_type = pbContent.e_type;
            this.origin_src = pbContent.origin_src;
            this.btn_type = pbContent.btn_type;
            this.origin_size = pbContent.origin_size;
            this.count = pbContent.count;
            this.graffiti_info = pbContent.graffiti_info;
            this.high_together = pbContent.high_together;
            this.media_subtitle = pbContent.media_subtitle;
            this.url_type = pbContent.url_type;
            this.meme_info = pbContent.meme_info;
            this.is_long_pic = pbContent.is_long_pic;
            this.show_original_btn = pbContent.show_original_btn;
            this.cdn_src_active = pbContent.cdn_src_active;
            this.topic_special_icon = pbContent.topic_special_icon;
            this.item_id = pbContent.item_id;
            this.item_forum_name = pbContent.item_forum_name;
            this.tiebaplus_info = pbContent.tiebaplus_info;
            this.item = pbContent.item;
            this.pic_id = pbContent.pic_id;
            this.link_type = pbContent.link_type;
            this.target_scheme = pbContent.target_scheme;
            this.text_plugin = pbContent.text_plugin;
            this.query_text = pbContent.query_text;
            this.query_prefix = pbContent.query_prefix;
            this.icon = pbContent.icon;
            this.portrait = pbContent.portrait;
            this.theme_color = pbContent.theme_color;
            this.search_type = pbContent.search_type;
            this.is_bot = pbContent.is_bot;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbContent build(boolean z) {
            return new PbContent(this, z);
        }
    }

    public PbContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.src;
            if (str3 == null) {
                this.src = "";
            } else {
                this.src = str3;
            }
            String str4 = builder.bsize;
            if (str4 == null) {
                this.bsize = "";
            } else {
                this.bsize = str4;
            }
            String str5 = builder.big_src;
            if (str5 == null) {
                this.big_src = "";
            } else {
                this.big_src = str5;
            }
            String str6 = builder.big_size;
            if (str6 == null) {
                this.big_size = "";
            } else {
                this.big_size = str6;
            }
            String str7 = builder.cdn_src;
            if (str7 == null) {
                this.cdn_src = "";
            } else {
                this.cdn_src = str7;
            }
            String str8 = builder.big_cdn_src;
            if (str8 == null) {
                this.big_cdn_src = "";
            } else {
                this.big_cdn_src = str8;
            }
            String str9 = builder.imgtype;
            if (str9 == null) {
                this.imgtype = "";
            } else {
                this.imgtype = str9;
            }
            String str10 = builder.c;
            if (str10 == null) {
                this.c = "";
            } else {
                this.c = str10;
            }
            String str11 = builder.voice_md5;
            if (str11 == null) {
                this.voice_md5 = "";
            } else {
                this.voice_md5 = str11;
            }
            Integer num2 = builder.during_time;
            if (num2 == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = num2;
            }
            Integer num3 = builder.is_sub;
            if (num3 == null) {
                this.is_sub = DEFAULT_IS_SUB;
            } else {
                this.is_sub = num3;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str12 = builder.dynamic;
            if (str12 == null) {
                this.dynamic = "";
            } else {
                this.dynamic = str12;
            }
            String str13 = builder._static;
            if (str13 == null) {
                this._static = "";
            } else {
                this._static = str13;
            }
            Integer num4 = builder.width;
            if (num4 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num4;
            }
            Integer num5 = builder.height;
            if (num5 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num5;
            }
            String str14 = builder.packet_name;
            if (str14 == null) {
                this.packet_name = "";
            } else {
                this.packet_name = str14;
            }
            String str15 = builder.phonetype;
            if (str15 == null) {
                this.phonetype = "";
            } else {
                this.phonetype = str15;
            }
            Integer num6 = builder.is_native_app;
            if (num6 == null) {
                this.is_native_app = DEFAULT_IS_NATIVE_APP;
            } else {
                this.is_native_app = num6;
            }
            this.native_app = builder.native_app;
            Integer num7 = builder.e_type;
            if (num7 == null) {
                this.e_type = DEFAULT_E_TYPE;
            } else {
                this.e_type = num7;
            }
            String str16 = builder.origin_src;
            if (str16 == null) {
                this.origin_src = "";
            } else {
                this.origin_src = str16;
            }
            Integer num8 = builder.btn_type;
            if (num8 == null) {
                this.btn_type = DEFAULT_BTN_TYPE;
            } else {
                this.btn_type = num8;
            }
            Integer num9 = builder.origin_size;
            if (num9 == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = num9;
            }
            Integer num10 = builder.count;
            if (num10 == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = num10;
            }
            this.graffiti_info = builder.graffiti_info;
            this.high_together = builder.high_together;
            String str17 = builder.media_subtitle;
            if (str17 == null) {
                this.media_subtitle = "";
            } else {
                this.media_subtitle = str17;
            }
            Integer num11 = builder.url_type;
            if (num11 == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = num11;
            }
            this.meme_info = builder.meme_info;
            Integer num12 = builder.is_long_pic;
            if (num12 == null) {
                this.is_long_pic = DEFAULT_IS_LONG_PIC;
            } else {
                this.is_long_pic = num12;
            }
            Integer num13 = builder.show_original_btn;
            if (num13 == null) {
                this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
            } else {
                this.show_original_btn = num13;
            }
            String str18 = builder.cdn_src_active;
            if (str18 == null) {
                this.cdn_src_active = "";
            } else {
                this.cdn_src_active = str18;
            }
            String str19 = builder.topic_special_icon;
            if (str19 == null) {
                this.topic_special_icon = "";
            } else {
                this.topic_special_icon = str19;
            }
            Long l2 = builder.item_id;
            if (l2 == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = l2;
            }
            String str20 = builder.item_forum_name;
            if (str20 == null) {
                this.item_forum_name = "";
            } else {
                this.item_forum_name = str20;
            }
            this.tiebaplus_info = builder.tiebaplus_info;
            this.item = builder.item;
            Long l3 = builder.pic_id;
            if (l3 == null) {
                this.pic_id = DEFAULT_PIC_ID;
            } else {
                this.pic_id = l3;
            }
            Integer num14 = builder.link_type;
            if (num14 == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = num14;
            }
            String str21 = builder.target_scheme;
            if (str21 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str21;
            }
            this.text_plugin = builder.text_plugin;
            String str22 = builder.query_text;
            if (str22 == null) {
                this.query_text = "";
            } else {
                this.query_text = str22;
            }
            String str23 = builder.query_prefix;
            if (str23 == null) {
                this.query_prefix = "";
            } else {
                this.query_prefix = str23;
            }
            String str24 = builder.icon;
            if (str24 == null) {
                this.icon = "";
            } else {
                this.icon = str24;
            }
            String str25 = builder.portrait;
            if (str25 == null) {
                this.portrait = "";
            } else {
                this.portrait = str25;
            }
            this.theme_color = builder.theme_color;
            Integer num15 = builder.search_type;
            if (num15 == null) {
                this.search_type = DEFAULT_SEARCH_TYPE;
            } else {
                this.search_type = num15;
            }
            Integer num16 = builder.is_bot;
            if (num16 == null) {
                this.is_bot = DEFAULT_IS_BOT;
                return;
            } else {
                this.is_bot = num16;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.link = builder.link;
        this.src = builder.src;
        this.bsize = builder.bsize;
        this.big_src = builder.big_src;
        this.big_size = builder.big_size;
        this.cdn_src = builder.cdn_src;
        this.big_cdn_src = builder.big_cdn_src;
        this.imgtype = builder.imgtype;
        this.c = builder.c;
        this.voice_md5 = builder.voice_md5;
        this.during_time = builder.during_time;
        this.is_sub = builder.is_sub;
        this.uid = builder.uid;
        this.dynamic = builder.dynamic;
        this._static = builder._static;
        this.width = builder.width;
        this.height = builder.height;
        this.packet_name = builder.packet_name;
        this.phonetype = builder.phonetype;
        this.is_native_app = builder.is_native_app;
        this.native_app = builder.native_app;
        this.e_type = builder.e_type;
        this.origin_src = builder.origin_src;
        this.btn_type = builder.btn_type;
        this.origin_size = builder.origin_size;
        this.count = builder.count;
        this.graffiti_info = builder.graffiti_info;
        this.high_together = builder.high_together;
        this.media_subtitle = builder.media_subtitle;
        this.url_type = builder.url_type;
        this.meme_info = builder.meme_info;
        this.is_long_pic = builder.is_long_pic;
        this.show_original_btn = builder.show_original_btn;
        this.cdn_src_active = builder.cdn_src_active;
        this.topic_special_icon = builder.topic_special_icon;
        this.item_id = builder.item_id;
        this.item_forum_name = builder.item_forum_name;
        this.tiebaplus_info = builder.tiebaplus_info;
        this.item = builder.item;
        this.pic_id = builder.pic_id;
        this.link_type = builder.link_type;
        this.target_scheme = builder.target_scheme;
        this.text_plugin = builder.text_plugin;
        this.query_text = builder.query_text;
        this.query_prefix = builder.query_prefix;
        this.icon = builder.icon;
        this.portrait = builder.portrait;
        this.theme_color = builder.theme_color;
        this.search_type = builder.search_type;
        this.is_bot = builder.is_bot;
    }
}