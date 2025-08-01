package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final String DEFAULT_MESSAGE = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 4)
    public final CommonReq f1523common;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String message;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1524common;
        public Long friend_id;
        public String message;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.friend_id = reqData.friend_id;
            this.message = reqData.message;
            this.f1524common = reqData.f1523common;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.friend_id;
            if (l == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = l;
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
            } else {
                this.message = str;
            }
            this.f1523common = builder.f1524common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.message = builder.message;
        this.f1523common = builder.f1524common;
    }
}