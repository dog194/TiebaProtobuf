package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetForumDetailReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetForumDetailReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumDetailReqIdl getForumDetailReqIdl) {
            super(getForumDetailReqIdl);
            if (getForumDetailReqIdl == null) {
                return;
            }
            this.data = getForumDetailReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumDetailReqIdl build(boolean z) {
            return new GetForumDetailReqIdl(this, z);
        }
    }

    public GetForumDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}