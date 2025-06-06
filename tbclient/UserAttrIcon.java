package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class UserAttrIcon extends Message {
    public static final String DEFAULT_COMMENT = "";
    public static final String DEFAULT_DEGRADE_IMG_SRC = "";
    public static final String DEFAULT_IMG_SRC = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PREFIX_IMG_SRC = "";
    public static final String DEFAULT_SUB_TYPE = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String comment;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer degrade_height;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String degrade_img_src;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer degrade_width;

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<UserIconExtAttr> ext_attr;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer height;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_src;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_url;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer prefix_height;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String prefix_img_src;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer prefix_width;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer show_type;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_type;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final List<UserIconExtAttr> DEFAULT_EXT_ATTR = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_TYPE = 0;
    public static final Integer DEFAULT_DEGRADE_HEIGHT = 0;
    public static final Integer DEFAULT_DEGRADE_WIDTH = 0;
    public static final Integer DEFAULT_PREFIX_HEIGHT = 0;
    public static final Integer DEFAULT_PREFIX_WIDTH = 0;

    public static final class Builder extends Message.Builder<UserAttrIcon> {
        public String comment;
        public Integer degrade_height;
        public String degrade_img_src;
        public Integer degrade_width;
        public List<UserIconExtAttr> ext_attr;
        public Integer height;
        public String img_src;
        public String link_url;
        public Integer prefix_height;
        public String prefix_img_src;
        public Integer prefix_width;
        public Integer show_type;
        public String sub_type;
        public String text;
        public String type;
        public Integer width;

        public Builder() {
        }

        public Builder(UserAttrIcon userAttrIcon) {
            super(userAttrIcon);
            if (userAttrIcon == null) {
                return;
            }
            this.type = userAttrIcon.type;
            this.sub_type = userAttrIcon.sub_type;
            this.comment = userAttrIcon.comment;
            this.img_src = userAttrIcon.img_src;
            this.link_url = userAttrIcon.link_url;
            this.height = userAttrIcon.height;
            this.width = userAttrIcon.width;
            this.ext_attr = Message.copyOf(userAttrIcon.ext_attr);
            this.show_type = userAttrIcon.show_type;
            this.degrade_img_src = userAttrIcon.degrade_img_src;
            this.degrade_height = userAttrIcon.degrade_height;
            this.degrade_width = userAttrIcon.degrade_width;
            this.prefix_img_src = userAttrIcon.prefix_img_src;
            this.prefix_height = userAttrIcon.prefix_height;
            this.prefix_width = userAttrIcon.prefix_width;
            this.text = userAttrIcon.text;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserAttrIcon build(boolean z) {
            return new UserAttrIcon(this, z);
        }
    }

    public UserAttrIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.sub_type;
            if (str2 == null) {
                this.sub_type = "";
            } else {
                this.sub_type = str2;
            }
            String str3 = builder.comment;
            if (str3 == null) {
                this.comment = "";
            } else {
                this.comment = str3;
            }
            String str4 = builder.img_src;
            if (str4 == null) {
                this.img_src = "";
            } else {
                this.img_src = str4;
            }
            String str5 = builder.link_url;
            if (str5 == null) {
                this.link_url = "";
            } else {
                this.link_url = str5;
            }
            Integer num = builder.height;
            if (num == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            List<UserIconExtAttr> list = builder.ext_attr;
            if (list == null) {
                this.ext_attr = DEFAULT_EXT_ATTR;
            } else {
                this.ext_attr = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.show_type;
            if (num3 == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
            } else {
                this.show_type = num3;
            }
            String str6 = builder.degrade_img_src;
            if (str6 == null) {
                this.degrade_img_src = "";
            } else {
                this.degrade_img_src = str6;
            }
            Integer num4 = builder.degrade_height;
            if (num4 == null) {
                this.degrade_height = DEFAULT_DEGRADE_HEIGHT;
            } else {
                this.degrade_height = num4;
            }
            Integer num5 = builder.degrade_width;
            if (num5 == null) {
                this.degrade_width = DEFAULT_DEGRADE_WIDTH;
            } else {
                this.degrade_width = num5;
            }
            String str7 = builder.prefix_img_src;
            if (str7 == null) {
                this.prefix_img_src = "";
            } else {
                this.prefix_img_src = str7;
            }
            Integer num6 = builder.prefix_height;
            if (num6 == null) {
                this.prefix_height = DEFAULT_PREFIX_HEIGHT;
            } else {
                this.prefix_height = num6;
            }
            Integer num7 = builder.prefix_width;
            if (num7 == null) {
                this.prefix_width = DEFAULT_PREFIX_WIDTH;
            } else {
                this.prefix_width = num7;
            }
            String str8 = builder.text;
            if (str8 == null) {
                this.text = "";
                return;
            } else {
                this.text = str8;
                return;
            }
        }
        this.type = builder.type;
        this.sub_type = builder.sub_type;
        this.comment = builder.comment;
        this.img_src = builder.img_src;
        this.link_url = builder.link_url;
        this.height = builder.height;
        this.width = builder.width;
        this.ext_attr = Message.immutableCopyOf(builder.ext_attr);
        this.show_type = builder.show_type;
        this.degrade_img_src = builder.degrade_img_src;
        this.degrade_height = builder.degrade_height;
        this.degrade_width = builder.degrade_width;
        this.prefix_img_src = builder.prefix_img_src;
        this.prefix_height = builder.prefix_height;
        this.prefix_width = builder.prefix_width;
        this.text = builder.text;
    }
}