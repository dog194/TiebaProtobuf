package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetHistoryForumResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetHistoryForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetHistoryForumResIdl getHistoryForumResIdl) {
            super(getHistoryForumResIdl);
            if (getHistoryForumResIdl == null) {
                return;
            }
            this.error = getHistoryForumResIdl.error;
            this.data = getHistoryForumResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetHistoryForumResIdl build(boolean z) {
            return new GetHistoryForumResIdl(this, z);
        }
    }

    public GetHistoryForumResIdl(Builder builder, boolean z) {
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