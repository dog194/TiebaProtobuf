package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FrsPageAreaCards extends Message {
    public static final String DEFAULT_AREA_TYPE = "";
    public static final List<FrsPageAreaCardsData> DEFAULT_CARD_DATA = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String area_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsPageAreaCardsData> card_data;

    public static final class Builder extends Message.Builder<FrsPageAreaCards> {
        public String area_type;
        public List<FrsPageAreaCardsData> card_data;

        public Builder() {
        }

        public Builder(FrsPageAreaCards frsPageAreaCards) {
            super(frsPageAreaCards);
            if (frsPageAreaCards == null) {
                return;
            }
            this.area_type = frsPageAreaCards.area_type;
            this.card_data = Message.copyOf(frsPageAreaCards.card_data);
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsPageAreaCards build(boolean z) {
            return new FrsPageAreaCards(this, z);
        }
    }

    public FrsPageAreaCards(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.area_type;
            if (str == null) {
                this.area_type = "";
            } else {
                this.area_type = str;
            }
            List<FrsPageAreaCardsData> list = builder.card_data;
            if (list == null) {
                this.card_data = DEFAULT_CARD_DATA;
                return;
            } else {
                this.card_data = Message.immutableCopyOf(list);
                return;
            }
        }
        this.area_type = builder.area_type;
        this.card_data = Message.immutableCopyOf(builder.card_data);
    }
}