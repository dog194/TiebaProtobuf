package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ForumRuleConf extends Message {
    public static final List<String> DEFAULT_FIRST_LEVEL_INDEX_LIST = Collections.emptyList();
    public static final List<String> DEFAULT_SECOND_LEVEL_INDEX_LIST = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> first_level_index_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> second_level_index_list;

    public static final class Builder extends Message.Builder<ForumRuleConf> {
        public List<String> first_level_index_list;
        public List<String> second_level_index_list;

        public Builder() {
        }

        public Builder(ForumRuleConf forumRuleConf) {
            super(forumRuleConf);
            if (forumRuleConf == null) {
                return;
            }
            this.first_level_index_list = Message.copyOf(forumRuleConf.first_level_index_list);
            this.second_level_index_list = Message.copyOf(forumRuleConf.second_level_index_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumRuleConf build(boolean z) {
            return new ForumRuleConf(this, z);
        }
    }

    public ForumRuleConf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.first_level_index_list;
            if (list == null) {
                this.first_level_index_list = DEFAULT_FIRST_LEVEL_INDEX_LIST;
            } else {
                this.first_level_index_list = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.second_level_index_list;
            if (list2 == null) {
                this.second_level_index_list = DEFAULT_SECOND_LEVEL_INDEX_LIST;
                return;
            } else {
                this.second_level_index_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.first_level_index_list = Message.immutableCopyOf(builder.first_level_index_list);
        this.second_level_index_list = Message.immutableCopyOf(builder.second_level_index_list);
    }
}