package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedHeadComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedHeadSymbol> alt_extra_data;

    @ProtoField(tag = 5)
    public final FeedHeadButton button;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedHeadSymbol> extra_data;

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final List<FeedHeadSymbol> DEFAULT_EXTRA_DATA = Collections.emptyList();
    public static final List<FeedHeadSymbol> DEFAULT_ALT_EXTRA_DATA = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedHeadComponent> {
        public List<FeedHeadSymbol> alt_extra_data;
        public FeedHeadButton button;
        public List<FeedHeadSymbol> extra_data;
        public FeedHeadImg image_data;
        public List<FeedHeadSymbol> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedHeadComponent feedHeadComponent) {
            super(feedHeadComponent);
            if (feedHeadComponent == null) {
                return;
            }
            this.image_data = feedHeadComponent.image_data;
            this.main_data = Message.copyOf(feedHeadComponent.main_data);
            this.extra_data = Message.copyOf(feedHeadComponent.extra_data);
            this.schema = feedHeadComponent.schema;
            this.button = feedHeadComponent.button;
            this.alt_extra_data = Message.copyOf(feedHeadComponent.alt_extra_data);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedHeadComponent build(boolean z) {
            return new FeedHeadComponent(this, z);
        }
    }

    public FeedHeadComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            List<FeedHeadSymbol> list2 = builder.extra_data;
            if (list2 == null) {
                this.extra_data = DEFAULT_EXTRA_DATA;
            } else {
                this.extra_data = Message.immutableCopyOf(list2);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.button = builder.button;
            List<FeedHeadSymbol> list3 = builder.alt_extra_data;
            if (list3 == null) {
                this.alt_extra_data = DEFAULT_ALT_EXTRA_DATA;
                return;
            } else {
                this.alt_extra_data = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.extra_data = Message.immutableCopyOf(builder.extra_data);
        this.schema = builder.schema;
        this.button = builder.button;
        this.alt_extra_data = Message.immutableCopyOf(builder.alt_extra_data);
    }
}