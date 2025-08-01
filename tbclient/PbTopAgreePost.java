package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PbTopAgreePost extends Message {
    public static final String DEFAULT_FORUM_TOP_LIST = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String forum_top_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
    public final List<Long> post_id_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_POST_ID_LIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<PbTopAgreePost> {
        public String forum_top_list;
        public List<Long> post_id_list;
        public List<Post> post_list;

        public Builder() {
        }

        public Builder(PbTopAgreePost pbTopAgreePost) {
            super(pbTopAgreePost);
            if (pbTopAgreePost == null) {
                return;
            }
            this.post_list = Message.copyOf(pbTopAgreePost.post_list);
            this.post_id_list = Message.copyOf(pbTopAgreePost.post_id_list);
            this.forum_top_list = pbTopAgreePost.forum_top_list;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbTopAgreePost build(boolean z) {
            return new PbTopAgreePost(this, z);
        }
    }

    public PbTopAgreePost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            List<Long> list2 = builder.post_id_list;
            if (list2 == null) {
                this.post_id_list = DEFAULT_POST_ID_LIST;
            } else {
                this.post_id_list = Message.immutableCopyOf(list2);
            }
            String str = builder.forum_top_list;
            if (str == null) {
                this.forum_top_list = "";
                return;
            } else {
                this.forum_top_list = str;
                return;
            }
        }
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.post_id_list = Message.immutableCopyOf(builder.post_id_list);
        this.forum_top_list = builder.forum_top_list;
    }
}