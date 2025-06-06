package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ConfigurableHeadTitle extends Message {
    public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
    public static final String DEFAULT_FONT_SIZE = "";

    @ProtoField(tag = 3)
    public final FeedContentGradiantColor background;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> data;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String font_size;

    public static final class Builder extends Message.Builder<ConfigurableHeadTitle> {
        public FeedContentGradiantColor background;
        public List<FeedContentResource> data;
        public String font_size;

        public Builder() {
        }

        public Builder(ConfigurableHeadTitle configurableHeadTitle) {
            super(configurableHeadTitle);
            if (configurableHeadTitle == null) {
                return;
            }
            this.data = Message.copyOf(configurableHeadTitle.data);
            this.font_size = configurableHeadTitle.font_size;
            this.background = configurableHeadTitle.background;
        }

        @Override // com.squareup.wire.Message.Builder
        public ConfigurableHeadTitle build(boolean z) {
            return new ConfigurableHeadTitle(this, z);
        }
    }

    public ConfigurableHeadTitle(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
            } else {
                this.data = Message.immutableCopyOf(list);
            }
            String str = builder.font_size;
            if (str == null) {
                this.font_size = "";
            } else {
                this.font_size = str;
            }
            this.background = builder.background;
            return;
        }
        this.data = Message.immutableCopyOf(builder.data);
        this.font_size = builder.font_size;
        this.background = builder.background;
    }
}