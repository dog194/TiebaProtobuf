package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class StarRank extends Message {
    public static final String DEFAULT_RANK_NAME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_USER_CURRENT_SCORE_NOTICE = "";
    public static final String DEFAULT_USER_TASK_NOTICE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<StarContriRecord> contri_record_list;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String rank_name;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_ranking;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer user_contri_score;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String user_current_score_notice;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<StarTaskInfo> user_task_info;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_task_notice;
    public static final Integer DEFAULT_RANK_RANKING = 0;
    public static final List<StarContriRecord> DEFAULT_CONTRI_RECORD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_USER_CONTRI_SCORE = 0;
    public static final List<StarTaskInfo> DEFAULT_USER_TASK_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<StarRank> {
        public List<StarContriRecord> contri_record_list;
        public String rank_name;
        public Integer rank_ranking;
        public String url;
        public Integer user_contri_score;
        public String user_current_score_notice;
        public List<StarTaskInfo> user_task_info;
        public String user_task_notice;

        public Builder() {
        }

        public Builder(StarRank starRank) {
            super(starRank);
            if (starRank == null) {
                return;
            }
            this.rank_name = starRank.rank_name;
            this.rank_ranking = starRank.rank_ranking;
            this.contri_record_list = Message.copyOf(starRank.contri_record_list);
            this.user_contri_score = starRank.user_contri_score;
            this.user_task_notice = starRank.user_task_notice;
            this.user_task_info = Message.copyOf(starRank.user_task_info);
            this.user_current_score_notice = starRank.user_current_score_notice;
            this.url = starRank.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public StarRank build(boolean z) {
            return new StarRank(this, z);
        }
    }

    public StarRank(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.rank_name;
            if (str == null) {
                this.rank_name = "";
            } else {
                this.rank_name = str;
            }
            Integer num = builder.rank_ranking;
            if (num == null) {
                this.rank_ranking = DEFAULT_RANK_RANKING;
            } else {
                this.rank_ranking = num;
            }
            List<StarContriRecord> list = builder.contri_record_list;
            if (list == null) {
                this.contri_record_list = DEFAULT_CONTRI_RECORD_LIST;
            } else {
                this.contri_record_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.user_contri_score;
            if (num2 == null) {
                this.user_contri_score = DEFAULT_USER_CONTRI_SCORE;
            } else {
                this.user_contri_score = num2;
            }
            String str2 = builder.user_task_notice;
            if (str2 == null) {
                this.user_task_notice = "";
            } else {
                this.user_task_notice = str2;
            }
            List<StarTaskInfo> list2 = builder.user_task_info;
            if (list2 == null) {
                this.user_task_info = DEFAULT_USER_TASK_INFO;
            } else {
                this.user_task_info = Message.immutableCopyOf(list2);
            }
            String str3 = builder.user_current_score_notice;
            if (str3 == null) {
                this.user_current_score_notice = "";
            } else {
                this.user_current_score_notice = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
                return;
            } else {
                this.url = str4;
                return;
            }
        }
        this.rank_name = builder.rank_name;
        this.rank_ranking = builder.rank_ranking;
        this.contri_record_list = Message.immutableCopyOf(builder.contri_record_list);
        this.user_contri_score = builder.user_contri_score;
        this.user_task_notice = builder.user_task_notice;
        this.user_task_info = Message.immutableCopyOf(builder.user_task_info);
        this.user_current_score_notice = builder.user_current_score_notice;
        this.url = builder.url;
    }
}