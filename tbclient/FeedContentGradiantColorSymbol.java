package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedContentGradiantColorSymbol extends Message {
    public static final String DEFAULT_GRADIANT = "";

    @ProtoField(tag = 1)
    public final FeedContentColor color;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gradiant;

    public static final class Builder extends Message.Builder<FeedContentGradiantColorSymbol> {
        public FeedContentColor color;
        public String gradiant;

        public Builder() {
        }

        public Builder(FeedContentGradiantColorSymbol feedContentGradiantColorSymbol) {
            super(feedContentGradiantColorSymbol);
            if (feedContentGradiantColorSymbol == null) {
                return;
            }
            this.color = feedContentGradiantColorSymbol.color;
            this.gradiant = feedContentGradiantColorSymbol.gradiant;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedContentGradiantColorSymbol build(boolean z) {
            return new FeedContentGradiantColorSymbol(this, z);
        }
    }

    public FeedContentGradiantColorSymbol(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.color = builder.color;
            String str = builder.gradiant;
            if (str == null) {
                this.gradiant = "";
                return;
            } else {
                this.gradiant = str;
                return;
            }
        }
        this.color = builder.color;
        this.gradiant = builder.gradiant;
    }
}