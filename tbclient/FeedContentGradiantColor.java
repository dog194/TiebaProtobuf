package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedContentGradiantColor extends Message {
    public static final List<FeedContentGradiantColorSymbol> DEFAULT_COLORS = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentGradiantColorSymbol> colors;

    public static final class Builder extends Message.Builder<FeedContentGradiantColor> {
        public List<FeedContentGradiantColorSymbol> colors;

        public Builder() {
        }

        public Builder(FeedContentGradiantColor feedContentGradiantColor) {
            super(feedContentGradiantColor);
            if (feedContentGradiantColor == null) {
                return;
            }
            this.colors = Message.copyOf(feedContentGradiantColor.colors);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedContentGradiantColor build(boolean z) {
            return new FeedContentGradiantColor(this, z);
        }
    }

    public FeedContentGradiantColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentGradiantColorSymbol> list = builder.colors;
            if (list == null) {
                this.colors = DEFAULT_COLORS;
                return;
            } else {
                this.colors = Message.immutableCopyOf(list);
                return;
            }
        }
        this.colors = Message.immutableCopyOf(builder.colors);
    }
}