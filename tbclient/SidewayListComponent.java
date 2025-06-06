package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SidewayListComponent extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SidewayRecomComponent> content;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer screen_max_num;
    public static final Integer DEFAULT_SCREEN_MAX_NUM = 0;
    public static final List<SidewayRecomComponent> DEFAULT_CONTENT = Collections.emptyList();

    public static final class Builder extends Message.Builder<SidewayListComponent> {
        public List<SidewayRecomComponent> content;
        public Integer screen_max_num;

        public Builder() {
        }

        public Builder(SidewayListComponent sidewayListComponent) {
            super(sidewayListComponent);
            if (sidewayListComponent == null) {
                return;
            }
            this.screen_max_num = sidewayListComponent.screen_max_num;
            this.content = Message.copyOf(sidewayListComponent.content);
        }

        @Override // com.squareup.wire.Message.Builder
        public SidewayListComponent build(boolean z) {
            return new SidewayListComponent(this, z);
        }
    }

    public SidewayListComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.screen_max_num;
            if (num == null) {
                this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
            } else {
                this.screen_max_num = num;
            }
            List<SidewayRecomComponent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.screen_max_num = builder.screen_max_num;
        this.content = Message.immutableCopyOf(builder.content);
    }
}