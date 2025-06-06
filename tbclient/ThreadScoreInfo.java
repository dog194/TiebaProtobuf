package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadScoreInfo extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadScoreItem> items;

    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.UINT64)
    public final List<Long> score_item_ids;

    @ProtoField(tag = 5)
    public final ScoreLevelLimit score_level_limit;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer show_index;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total_items_count;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long total_user_count;
    public static final Integer DEFAULT_TOTAL_ITEMS_COUNT = 0;
    public static final List<ThreadScoreItem> DEFAULT_ITEMS = Collections.emptyList();
    public static final Long DEFAULT_TOTAL_USER_COUNT = 0L;
    public static final Integer DEFAULT_SHOW_INDEX = 0;
    public static final List<Long> DEFAULT_SCORE_ITEM_IDS = Collections.emptyList();

    public static final class Builder extends Message.Builder<ThreadScoreInfo> {
        public List<ThreadScoreItem> items;
        public List<Long> score_item_ids;
        public ScoreLevelLimit score_level_limit;
        public Integer show_index;
        public Integer total_items_count;
        public Long total_user_count;

        public Builder() {
        }

        public Builder(ThreadScoreInfo threadScoreInfo) {
            super(threadScoreInfo);
            if (threadScoreInfo == null) {
                return;
            }
            this.total_items_count = threadScoreInfo.total_items_count;
            this.items = Message.copyOf(threadScoreInfo.items);
            this.total_user_count = threadScoreInfo.total_user_count;
            this.show_index = threadScoreInfo.show_index;
            this.score_level_limit = threadScoreInfo.score_level_limit;
            this.score_item_ids = Message.copyOf(threadScoreInfo.score_item_ids);
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadScoreInfo build(boolean z) {
            return new ThreadScoreInfo(this, z);
        }
    }

    public ThreadScoreInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.total_items_count;
            if (num == null) {
                this.total_items_count = DEFAULT_TOTAL_ITEMS_COUNT;
            } else {
                this.total_items_count = num;
            }
            List<ThreadScoreItem> list = builder.items;
            if (list == null) {
                this.items = DEFAULT_ITEMS;
            } else {
                this.items = Message.immutableCopyOf(list);
            }
            Long l = builder.total_user_count;
            if (l == null) {
                this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
            } else {
                this.total_user_count = l;
            }
            Integer num2 = builder.show_index;
            if (num2 == null) {
                this.show_index = DEFAULT_SHOW_INDEX;
            } else {
                this.show_index = num2;
            }
            this.score_level_limit = builder.score_level_limit;
            List<Long> list2 = builder.score_item_ids;
            if (list2 == null) {
                this.score_item_ids = DEFAULT_SCORE_ITEM_IDS;
                return;
            } else {
                this.score_item_ids = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.total_items_count = builder.total_items_count;
        this.items = Message.immutableCopyOf(builder.items);
        this.total_user_count = builder.total_user_count;
        this.show_index = builder.show_index;
        this.score_level_limit = builder.score_level_limit;
        this.score_item_ids = Message.immutableCopyOf(builder.score_item_ids);
    }
}