package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class QueryCollectUpdateNumReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<QueryCollectUpdateNumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(QueryCollectUpdateNumReqIdl queryCollectUpdateNumReqIdl) {
            super(queryCollectUpdateNumReqIdl);
            if (queryCollectUpdateNumReqIdl == null) {
                return;
            }
            this.data = queryCollectUpdateNumReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryCollectUpdateNumReqIdl build(boolean z) {
            return new QueryCollectUpdateNumReqIdl(this, z);
        }
    }

    public QueryCollectUpdateNumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}