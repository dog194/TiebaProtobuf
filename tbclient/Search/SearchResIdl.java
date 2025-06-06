package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class SearchResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<SearchResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SearchResIdl searchResIdl) {
            super(searchResIdl);
            if (searchResIdl == null) {
                return;
            }
            this.error = searchResIdl.error;
            this.data = searchResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SearchResIdl build(boolean z) {
            return new SearchResIdl(this, z);
        }
    }

    public SearchResIdl(Builder builder, boolean z) {
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