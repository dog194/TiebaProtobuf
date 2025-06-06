package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AreaCardData extends Message {
    public static final String DEFAULT_CARD_TYPE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_type;

    @ProtoField(tag = 2)
    public final CardData data;

    public static final class Builder extends Message.Builder<AreaCardData> {
        public String card_type;
        public CardData data;

        public Builder() {
        }

        public Builder(AreaCardData areaCardData) {
            super(areaCardData);
            if (areaCardData == null) {
                return;
            }
            this.card_type = areaCardData.card_type;
            this.data = areaCardData.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AreaCardData build(boolean z) {
            return new AreaCardData(this, z);
        }
    }

    public AreaCardData(Builder builder, boolean z) {
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