package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BubbleV2 extends Message {
    public static final String DEFAULT_COLOR_DAY_END = "";
    public static final String DEFAULT_COLOR_DAY_START = "";
    public static final String DEFAULT_COLOR_NIGHT_END = "";
    public static final String DEFAULT_COLOR_NIGHT_START = "";
    public static final String DEFAULT_COMMENT_COLOR_DAY_END = "";
    public static final String DEFAULT_COMMENT_COLOR_DAY_START = "";
    public static final String DEFAULT_COMMENT_COLOR_NIGHT_END = "";
    public static final String DEFAULT_COMMENT_COLOR_NIGHT_START = "";
    public static final String DEFAULT_MAIN_ELEMENT_ICON = "";
    public static final String DEFAULT_MAIN_ELEMENT_VIDEO = "";
    public static final String DEFAULT_SUB_ELEMENT_ICON = "";
    public static final String DEFAULT_SUB_ELEMENT_VIDEO = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String color_day_end;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String color_day_start;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String color_night_end;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String color_night_start;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String comment_color_day_end;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String comment_color_day_start;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String comment_color_night_end;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String comment_color_night_start;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String main_element_icon;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String main_element_video;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sub_element_icon;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String sub_element_video;

    public static final class Builder extends Message.Builder<BubbleV2> {
        public String color_day_end;
        public String color_day_start;
        public String color_night_end;
        public String color_night_start;
        public String comment_color_day_end;
        public String comment_color_day_start;
        public String comment_color_night_end;
        public String comment_color_night_start;
        public String main_element_icon;
        public String main_element_video;
        public String sub_element_icon;
        public String sub_element_video;

        public Builder() {
        }

        public Builder(BubbleV2 bubbleV2) {
            super(bubbleV2);
            if (bubbleV2 == null) {
                return;
            }
            this.color_day_start = bubbleV2.color_day_start;
            this.color_night_start = bubbleV2.color_night_start;
            this.main_element_icon = bubbleV2.main_element_icon;
            this.main_element_video = bubbleV2.main_element_video;
            this.color_day_end = bubbleV2.color_day_end;
            this.color_night_end = bubbleV2.color_night_end;
            this.sub_element_icon = bubbleV2.sub_element_icon;
            this.sub_element_video = bubbleV2.sub_element_video;
            this.comment_color_day_start = bubbleV2.comment_color_day_start;
            this.comment_color_night_start = bubbleV2.comment_color_night_start;
            this.comment_color_day_end = bubbleV2.comment_color_day_end;
            this.comment_color_night_end = bubbleV2.comment_color_night_end;
        }

        @Override // com.squareup.wire.Message.Builder
        public BubbleV2 build(boolean z) {
            return new BubbleV2(this, z);
        }
    }

    public BubbleV2(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.color_day_start;
            if (str == null) {
                this.color_day_start = "";
            } else {
                this.color_day_start = str;
            }
            String str2 = builder.color_night_start;
            if (str2 == null) {
                this.color_night_start = "";
            } else {
                this.color_night_start = str2;
            }
            String str3 = builder.main_element_icon;
            if (str3 == null) {
                this.main_element_icon = "";
            } else {
                this.main_element_icon = str3;
            }
            String str4 = builder.main_element_video;
            if (str4 == null) {
                this.main_element_video = "";
            } else {
                this.main_element_video = str4;
            }
            String str5 = builder.color_day_end;
            if (str5 == null) {
                this.color_day_end = "";
            } else {
                this.color_day_end = str5;
            }
            String str6 = builder.color_night_end;
            if (str6 == null) {
                this.color_night_end = "";
            } else {
                this.color_night_end = str6;
            }
            String str7 = builder.sub_element_icon;
            if (str7 == null) {
                this.sub_element_icon = "";
            } else {
                this.sub_element_icon = str7;
            }
            String str8 = builder.sub_element_video;
            if (str8 == null) {
                this.sub_element_video = "";
            } else {
                this.sub_element_video = str8;
            }
            String str9 = builder.comment_color_day_start;
            if (str9 == null) {
                this.comment_color_day_start = "";
            } else {
                this.comment_color_day_start = str9;
            }
            String str10 = builder.comment_color_night_start;
            if (str10 == null) {
                this.comment_color_night_start = "";
            } else {
                this.comment_color_night_start = str10;
            }
            String str11 = builder.comment_color_day_end;
            if (str11 == null) {
                this.comment_color_day_end = "";
            } else {
                this.comment_color_day_end = str11;
            }
            String str12 = builder.comment_color_night_end;
            if (str12 == null) {
                this.comment_color_night_end = "";
                return;
            } else {
                this.comment_color_night_end = str12;
                return;
            }
        }
        this.color_day_start = builder.color_day_start;
        this.color_night_start = builder.color_night_start;
        this.main_element_icon = builder.main_element_icon;
        this.main_element_video = builder.main_element_video;
        this.color_day_end = builder.color_day_end;
        this.color_night_end = builder.color_night_end;
        this.sub_element_icon = builder.sub_element_icon;
        this.sub_element_video = builder.sub_element_video;
        this.comment_color_day_start = builder.comment_color_day_start;
        this.comment_color_night_start = builder.comment_color_night_start;
        this.comment_color_day_end = builder.comment_color_day_end;
        this.comment_color_night_end = builder.comment_color_night_end;
    }
}