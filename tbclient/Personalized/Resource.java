package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Resource extends Message {
    public static final String DEFAULT_ICON_TEXT = "";
    public static final String DEFAULT_RES_IMAGE = "";
    public static final String DEFAULT_RES_LINK = "";
    public static final String DEFAULT_RES_TITLE = "";
    public static final String DEFAULT_USER_IMAGE = "";
    public static final String DEFAULT_USER_LINK = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String icon_text;

    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long position;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long res_id;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String res_image;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String res_link;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String res_title;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_image;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_link;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_RES_ID = 0L;
    public static final Long DEFAULT_POSITION = 0L;

    public static final class Builder extends Message.Builder<Resource> {
        public String icon_text;
        public Long position;
        public Long res_id;
        public String res_image;
        public String res_link;
        public String res_title;
        public String user_image;
        public String user_link;
        public String user_name;

        public Builder() {
        }

        public Builder(Resource resource) {
            super(resource);
            if (resource == null) {
                return;
            }
            this.res_id = resource.res_id;
            this.user_name = resource.user_name;
            this.user_image = resource.user_image;
            this.user_link = resource.user_link;
            this.res_title = resource.res_title;
            this.res_image = resource.res_image;
            this.res_link = resource.res_link;
            this.position = resource.position;
            this.icon_text = resource.icon_text;
        }

        @Override // com.squareup.wire.Message.Builder
        public Resource build(boolean z) {
            return new Resource(this, z);
        }
    }

    public Resource(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.res_id;
            if (l == null) {
                this.res_id = DEFAULT_RES_ID;
            } else {
                this.res_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_image;
            if (str2 == null) {
                this.user_image = "";
            } else {
                this.user_image = str2;
            }
            String str3 = builder.user_link;
            if (str3 == null) {
                this.user_link = "";
            } else {
                this.user_link = str3;
            }
            String str4 = builder.res_title;
            if (str4 == null) {
                this.res_title = "";
            } else {
                this.res_title = str4;
            }
            String str5 = builder.res_image;
            if (str5 == null) {
                this.res_image = "";
            } else {
                this.res_image = str5;
            }
            String str6 = builder.res_link;
            if (str6 == null) {
                this.res_link = "";
            } else {
                this.res_link = str6;
            }
            Long l2 = builder.position;
            if (l2 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = l2;
            }
            String str7 = builder.icon_text;
            if (str7 == null) {
                this.icon_text = "";
                return;
            } else {
                this.icon_text = str7;
                return;
            }
        }
        this.res_id = builder.res_id;
        this.user_name = builder.user_name;
        this.user_image = builder.user_image;
        this.user_link = builder.user_link;
        this.res_title = builder.res_title;
        this.res_image = builder.res_image;
        this.res_link = builder.res_link;
        this.position = builder.position;
        this.icon_text = builder.icon_text;
    }
}