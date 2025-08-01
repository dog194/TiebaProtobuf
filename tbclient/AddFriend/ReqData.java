package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_ST_TYPE = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 4)
    public final CommonReq f1317common;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String message;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String st_type;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1318common;
        public Long friend_id;
        public String message;
        public String st_type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.friend_id = reqData.friend_id;
            this.message = reqData.message;
            this.st_type = reqData.st_type;
            this.f1318common = reqData.f1317common;
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
            String str2 = builder.st_type;
            if (str2 == null) {
                this.st_type = "";
            } else {
                this.st_type = str2;
            }
            this.f1317common = builder.f1318common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.message = builder.message;
        this.st_type = builder.st_type;
        this.f1317common = builder.f1318common;
    }
}