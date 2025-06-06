package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class RightBoxInfo extends Message {
    public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
    public static final String DEFAULT_FONT_SIZE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> data;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String font_size;

    public static final class Builder extends Message.Builder<RightBoxInfo> {
        public List<FeedContentResource> data;
        public String font_size;

        public Builder() {
        }

        public Builder(RightBoxInfo rightBoxInfo) {
            super(rightBoxInfo);
            if (rightBoxInfo == null) {
                return;
            }
            this.data = Message.copyOf(rightBoxInfo.data);
            this.font_size = rightBoxInfo.font_size;
        }

        @Override // com.squareup.wire.Message.Builder
        public RightBoxInfo build(boolean z) {
            return new RightBoxInfo(this, z);
        }
    }

    public RightBoxInfo(Builder builder, boolean z) {
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
                return;
            } else {
                this.font_size = str;
                return;
            }
        }
        this.data = Message.immutableCopyOf(builder.data);
        this.font_size = builder.font_size;
    }
}