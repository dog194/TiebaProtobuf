package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FrsTopThreadCardLayout extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer init_state;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> prefetch_schema;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<String> DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
    public static final Integer DEFAULT_INIT_STATE = 0;

    public static final class Builder extends Message.Builder<FrsTopThreadCardLayout> {
        public List<ComponentFactory> components;
        public Integer init_state;
        public List<FeedKV> log_param;
        public List<String> prefetch_schema;

        public Builder() {
        }

        public Builder(FrsTopThreadCardLayout frsTopThreadCardLayout) {
            super(frsTopThreadCardLayout);
            if (frsTopThreadCardLayout == null) {
                return;
            }
            this.components = Message.copyOf(frsTopThreadCardLayout.components);
            this.log_param = Message.copyOf(frsTopThreadCardLayout.log_param);
            this.prefetch_schema = Message.copyOf(frsTopThreadCardLayout.prefetch_schema);
            this.init_state = frsTopThreadCardLayout.init_state;
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsTopThreadCardLayout build(boolean z) {
            return new FrsTopThreadCardLayout(this, z);
        }
    }

    public FrsTopThreadCardLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.prefetch_schema;
            if (list3 == null) {
                this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
            } else {
                this.prefetch_schema = Message.immutableCopyOf(list3);
            }
            Integer num = builder.init_state;
            if (num == null) {
                this.init_state = DEFAULT_INIT_STATE;
                return;
            } else {
                this.init_state = num;
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.prefetch_schema = Message.immutableCopyOf(builder.prefetch_schema);
        this.init_state = builder.init_state;
    }
}