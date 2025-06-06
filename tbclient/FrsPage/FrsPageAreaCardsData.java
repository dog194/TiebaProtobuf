package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FrsPageAreaCardsData extends Message {
    public static final String DEFAULT_CARD_TYPE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_type;

    @ProtoField(tag = 2)
    public final FrsPageCardData data;

    public static final class Builder extends Message.Builder<FrsPageAreaCardsData> {
        public String card_type;
        public FrsPageCardData data;

        public Builder() {
        }

        public Builder(FrsPageAreaCardsData frsPageAreaCardsData) {
            super(frsPageAreaCardsData);
            if (frsPageAreaCardsData == null) {
                return;
            }
            this.card_type = frsPageAreaCardsData.card_type;
            this.data = frsPageAreaCardsData.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsPageAreaCardsData build(boolean z) {
            return new FrsPageAreaCardsData(this, z);
        }
    }

    public FrsPageAreaCardsData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_type;
            if (str == null) {
                this.card_type = "";
            } else {
                this.card_type = str;
            }
            this.data = builder.data;
            return;
        }
        this.card_type = builder.card_type;
        this.data = builder.data;
    }
}