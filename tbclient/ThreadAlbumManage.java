package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadAlbumManage extends Message {
    public static final Integer DEFAULT_CAN_ADD = 0;
    public static final String DEFAULT_TOAST = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_add;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String toast;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<ThreadAlbumManage> {
        public Integer can_add;
        public String toast;
        public String url;

        public Builder() {
        }

        public Builder(ThreadAlbumManage threadAlbumManage) {
            super(threadAlbumManage);
            if (threadAlbumManage == null) {
                return;
            }
            this.can_add = threadAlbumManage.can_add;
            this.url = threadAlbumManage.url;
            this.toast = threadAlbumManage.toast;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadAlbumManage build(boolean z) {
            return new ThreadAlbumManage(this, z);
        }
    }

    public ThreadAlbumManage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.can_add;
            if (num == null) {
                this.can_add = DEFAULT_CAN_ADD;
            } else {
                this.can_add = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.toast;
            if (str2 == null) {
                this.toast = "";
                return;
            } else {
                this.toast = str2;
                return;
            }
        }
        this.can_add = builder.can_add;
        this.url = builder.url;
        this.toast = builder.toast;
    }
}