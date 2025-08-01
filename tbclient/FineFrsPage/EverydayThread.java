package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class EverydayThread extends Message {
    public static final List<FineThreadInfo> DEFAULT_FINE_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_TIME = 0;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineThreadInfo> fine_thread_list;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer show_time;

    public static final class Builder extends Message.Builder<EverydayThread> {
        public List<FineThreadInfo> fine_thread_list;
        public Integer show_time;

        public Builder() {
        }

        public Builder(EverydayThread everydayThread) {
            super(everydayThread);
            if (everydayThread == null) {
                return;
            }
            this.fine_thread_list = Message.copyOf(everydayThread.fine_thread_list);
            this.show_time = everydayThread.show_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public EverydayThread build(boolean z) {
            return new EverydayThread(this, z);
        }
    }

    public EverydayThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FineThreadInfo> list = builder.fine_thread_list;
            if (list == null) {
                this.fine_thread_list = DEFAULT_FINE_THREAD_LIST;
            } else {
                this.fine_thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.show_time;
            if (num == null) {
                this.show_time = DEFAULT_SHOW_TIME;
                return;
            } else {
                this.show_time = num;
                return;
            }
        }
        this.fine_thread_list = Message.immutableCopyOf(builder.fine_thread_list);
        this.show_time = builder.show_time;
    }
}