package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class MaskColor extends Message {

    @ProtoField(tag = 1)
    public final ThemeColorInfo begin_color;

    @ProtoField(tag = 2)
    public final ThemeColorInfo end_color;

    public static final class Builder extends Message.Builder<MaskColor> {
        public ThemeColorInfo begin_color;
        public ThemeColorInfo end_color;

        public Builder() {
        }

        public Builder(MaskColor maskColor) {
            super(maskColor);
            if (maskColor == null) {
                return;
            }
            this.begin_color = maskColor.begin_color;
            this.end_color = maskColor.end_color;
        }

        @Override // com.squareup.wire.Message.Builder
        public MaskColor build(boolean z) {
            return new MaskColor(this, z);
        }
    }

    public MaskColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.begin_color = builder.begin_color;
            this.end_color = builder.end_color;
        } else {
            this.begin_color = builder.begin_color;
            this.end_color = builder.end_color;
        }
    }
}