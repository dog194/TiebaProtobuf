package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_PUBLISH_PIC = "";
    public static final String DEFAULT_PUBLISH_USER = "";

    @ProtoField(tag = 1)
    public final User author;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String publish_pic;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String publish_user;

    @ProtoField(tag = 4)
    public final LockWindowThreadInfo thread_info;

    public static final class Builder extends Message.Builder<DataRes> {
        public User author;
        public String publish_pic;
        public String publish_user;
        public LockWindowThreadInfo thread_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.author = dataRes.author;
            this.publish_pic = dataRes.publish_pic;
            this.publish_user = dataRes.publish_user;
            this.thread_info = dataRes.thread_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.author = builder.author;
            String str = builder.publish_pic;
            if (str == null) {
                this.publish_pic = "";
            } else {
                this.publish_pic = str;
            }
            String str2 = builder.publish_user;
            if (str2 == null) {
                this.publish_user = "";
            } else {
                this.publish_user = str2;
            }
            this.thread_info = builder.thread_info;
            return;
        }
        this.author = builder.author;
        this.publish_pic = builder.publish_pic;
        this.publish_user = builder.publish_user;
        this.thread_info = builder.thread_info;
    }
}