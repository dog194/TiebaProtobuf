package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class VipAd extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_BACKGROUND_IMG = "";
    public static final String DEFAULT_BACKGROUND_IMG_DARK = "";
    public static final String DEFAULT_CREATE_TIME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String background_img;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String background_img_dark;

    @ProtoField(tag = 10)
    public final AdCloseInfo close_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<Post> comments;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String create_time;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Media> image;

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Media> image_dark;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_name;
    public static final List<Media> DEFAULT_IMAGE = Collections.emptyList();
    public static final List<Media> DEFAULT_IMAGE_DARK = Collections.emptyList();
    public static final List<Post> DEFAULT_COMMENTS = Collections.emptyList();

    public static final class Builder extends Message.Builder<VipAd> {
        public String avatar;
        public String background_img;
        public String background_img_dark;
        public AdCloseInfo close_info;
        public List<Post> comments;
        public String create_time;
        public List<Media> image;
        public List<Media> image_dark;
        public String title;
        public String user_name;

        public Builder() {
        }

        public Builder(VipAd vipAd) {
            super(vipAd);
            if (vipAd == null) {
                return;
            }
            this.background_img = vipAd.background_img;
            this.background_img_dark = vipAd.background_img_dark;
            this.avatar = vipAd.avatar;
            this.user_name = vipAd.user_name;
            this.create_time = vipAd.create_time;
            this.title = vipAd.title;
            this.image = Message.copyOf(vipAd.image);
            this.image_dark = Message.copyOf(vipAd.image_dark);
            this.comments = Message.copyOf(vipAd.comments);
            this.close_info = vipAd.close_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public VipAd build(boolean z) {
            return new VipAd(this, z);
        }
    }

    public VipAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.background_img;
            if (str == null) {
                this.background_img = "";
            } else {
                this.background_img = str;
            }
            String str2 = builder.background_img_dark;
            if (str2 == null) {
                this.background_img_dark = "";
            } else {
                this.background_img_dark = str2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.create_time;
            if (str5 == null) {
                this.create_time = "";
            } else {
                this.create_time = str5;
            }
            String str6 = builder.title;
            if (str6 == null) {
                this.title = "";
            } else {
                this.title = str6;
            }
            List<Media> list = builder.image;
            if (list == null) {
                this.image = DEFAULT_IMAGE;
            } else {
                this.image = Message.immutableCopyOf(list);
            }
            List<Media> list2 = builder.image_dark;
            if (list2 == null) {
                this.image_dark = DEFAULT_IMAGE_DARK;
            } else {
                this.image_dark = Message.immutableCopyOf(list2);
            }
            List<Post> list3 = builder.comments;
            if (list3 == null) {
                this.comments = DEFAULT_COMMENTS;
            } else {
                this.comments = Message.immutableCopyOf(list3);
            }
            this.close_info = builder.close_info;
            return;
        }
        this.background_img = builder.background_img;
        this.background_img_dark = builder.background_img_dark;
        this.avatar = builder.avatar;
        this.user_name = builder.user_name;
        this.create_time = builder.create_time;
        this.title = builder.title;
        this.image = Message.immutableCopyOf(builder.image);
        this.image_dark = Message.immutableCopyOf(builder.image_dark);
        this.comments = Message.immutableCopyOf(builder.comments);
        this.close_info = builder.close_info;
    }
}