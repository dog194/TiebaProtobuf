package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1342common;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1343common;
        public Long friend_id;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.friend_id = reqData.friend_id;
            this.f1343common = reqData.f1342common;
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
            this.f1342common = builder.f1343common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.f1342common = builder.f1343common;
    }
}