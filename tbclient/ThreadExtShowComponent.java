package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadExtShowComponent extends Message {
    public static final String DEFAULT_TEXT_INFO = "";

    @ProtoField(tag = 3)
    public final FeedHeadSymbol extra_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> img_urls;

    @ProtoField(tag = 5, type = Message.Datatype.BOOL)
    public final Boolean is_pic_thread;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text_info;
    public static final List<String> DEFAULT_IMG_URLS = Collections.emptyList();
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
    public static final Boolean DEFAULT_IS_PIC_THREAD = Boolean.FALSE;

    public static final class Builder extends Message.Builder<ThreadExtShowComponent> {
        public FeedHeadSymbol extra_data;
        public List<String> img_urls;
        public Boolean is_pic_thread;
        public List<LayoutManageInfo> manage_list;
        public String text_info;

        public Builder() {
        }

        public Builder(ThreadExtShowComponent threadExtShowComponent) {
            super(threadExtShowComponent);
            if (threadExtShowComponent == null) {
                return;
            }
            this.img_urls = Message.copyOf(threadExtShowComponent.img_urls);
            this.text_info = threadExtShowComponent.text_info;
            this.extra_data = threadExtShowComponent.extra_data;
            this.manage_list = Message.copyOf(threadExtShowComponent.manage_list);
            this.is_pic_thread = threadExtShowComponent.is_pic_thread;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadExtShowComponent build(boolean z) {
            return new ThreadExtShowComponent(this, z);
        }
    }

    public ThreadExtShowComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.img_urls;
            if (list == null) {
                this.img_urls = DEFAULT_IMG_URLS;
            } else {
                this.img_urls = Message.immutableCopyOf(list);
            }
            String str = builder.text_info;
            if (str == null) {
                this.text_info = "";
            } else {
                this.text_info = str;
            }
            this.extra_data = builder.extra_data;
            List<LayoutManageInfo> list2 = builder.manage_list;
            if (list2 == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
            } else {
                this.manage_list = Message.immutableCopyOf(list2);
            }
            Boolean bool = builder.is_pic_thread;
            if (bool == null) {
                this.is_pic_thread = DEFAULT_IS_PIC_THREAD;
                return;
            } else {
                this.is_pic_thread = bool;
                return;
            }
        }
        this.img_urls = Message.immutableCopyOf(builder.img_urls);
        this.text_info = builder.text_info;
        this.extra_data = builder.extra_data;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
        this.is_pic_thread = builder.is_pic_thread;
    }
}