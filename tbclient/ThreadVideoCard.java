package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadVideoCard extends Message {
    public static final String DEFAULT_LINK_TITLE = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_title;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer thumbnail_height;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;

    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thumbnail_width;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String video_url;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT = 0;
    public static final Integer DEFAULT_THUMBNAIL_WIDTH = 0;

    public static final class Builder extends Message.Builder<ThreadVideoCard> {
        public String link_title;
        public Integer thumbnail_height;
        public String thumbnail_url;
        public Integer thumbnail_width;
        public String title;
        public String video_url;

        public Builder() {
        }

        public Builder(ThreadVideoCard threadVideoCard) {
            super(threadVideoCard);
            if (threadVideoCard == null) {
                return;
            }
            this.title = threadVideoCard.title;
            this.link_title = threadVideoCard.link_title;
            this.video_url = threadVideoCard.video_url;
            this.thumbnail_url = threadVideoCard.thumbnail_url;
            this.thumbnail_height = threadVideoCard.thumbnail_height;
            this.thumbnail_width = threadVideoCard.thumbnail_width;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadVideoCard build(boolean z) {
            return new ThreadVideoCard(this, z);
        }
    }

    public ThreadVideoCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.link_title;
            if (str2 == null) {
                this.link_title = "";
            } else {
                this.link_title = str2;
            }
            String str3 = builder.video_url;
            if (str3 == null) {
                this.video_url = "";
            } else {
                this.video_url = str3;
            }
            String str4 = builder.thumbnail_url;
            if (str4 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str4;
            }
            Integer num = builder.thumbnail_height;
            if (num == null) {
                this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
            } else {
                this.thumbnail_height = num;
            }
            Integer num2 = builder.thumbnail_width;
            if (num2 == null) {
                this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
                return;
            } else {
                this.thumbnail_width = num2;
                return;
            }
        }
        this.title = builder.title;
        this.link_title = builder.link_title;
        this.video_url = builder.video_url;
        this.thumbnail_url = builder.thumbnail_url;
        this.thumbnail_height = builder.thumbnail_height;
        this.thumbnail_width = builder.thumbnail_width;
    }
}