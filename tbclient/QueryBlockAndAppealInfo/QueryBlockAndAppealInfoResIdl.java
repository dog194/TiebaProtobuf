package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class QueryBlockAndAppealInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<QueryBlockAndAppealInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(QueryBlockAndAppealInfoResIdl queryBlockAndAppealInfoResIdl) {
            super(queryBlockAndAppealInfoResIdl);
            if (queryBlockAndAppealInfoResIdl == null) {
                return;
            }
            this.error = queryBlockAndAppealInfoResIdl.error;
            this.data = queryBlockAndAppealInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryBlockAndAppealInfoResIdl build(boolean z) {
            return new QueryBlockAndAppealInfoResIdl(this, z);
        }
    }

    public QueryBlockAndAppealInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}