package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FrsBottomActivityBase extends Message {
    public static final List<FrsBottomActivity> DEFAULT_ACTIVITY_LIST = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FrsBottomActivity> activity_list;

    public static final class Builder extends Message.Builder<FrsBottomActivityBase> {
        public List<FrsBottomActivity> activity_list;

        public Builder() {
        }

        public Builder(FrsBottomActivityBase frsBottomActivityBase) {
            super(frsBottomActivityBase);
            if (frsBottomActivityBase == null) {
                return;
            }
            this.activity_list = Message.copyOf(frsBottomActivityBase.activity_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsBottomActivityBase build(boolean z) {
            return new FrsBottomActivityBase(this, z);
        }
    }

    public FrsBottomActivityBase(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FrsBottomActivity> list = builder.activity_list;
            if (list == null) {
                this.activity_list = DEFAULT_ACTIVITY_LIST;
                return;
            } else {
                this.activity_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.activity_list = Message.immutableCopyOf(builder.activity_list);
    }
}