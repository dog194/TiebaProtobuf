package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class HistorySwanResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<HistorySwanResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HistorySwanResIdl historySwanResIdl) {
            super(historySwanResIdl);
            if (historySwanResIdl == null) {
                return;
            }
            this.error = historySwanResIdl.error;
            this.data = historySwanResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public HistorySwanResIdl build(boolean z) {
            return new HistorySwanResIdl(this, z);
        }
    }

    public HistorySwanResIdl(Builder builder, boolean z) {
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