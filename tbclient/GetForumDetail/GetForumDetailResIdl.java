package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetForumDetailResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetForumDetailResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumDetailResIdl getForumDetailResIdl) {
            super(getForumDetailResIdl);
            if (getForumDetailResIdl == null) {
                return;
            }
            this.error = getForumDetailResIdl.error;
            this.data = getForumDetailResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumDetailResIdl build(boolean z) {
            return new GetForumDetailResIdl(this, z);
        }
    }

    public GetForumDetailResIdl(Builder builder, boolean z) {
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