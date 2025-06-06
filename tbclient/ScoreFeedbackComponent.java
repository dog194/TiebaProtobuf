package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ScoreFeedbackComponent extends Message {
    public static final List<ScoreIcon> DEFAULT_SCORE_ICON_LIST = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ScoreIcon> score_icon_list;

    public static final class Builder extends Message.Builder<ScoreFeedbackComponent> {
        public List<ScoreIcon> score_icon_list;

        public Builder() {
        }

        public Builder(ScoreFeedbackComponent scoreFeedbackComponent) {
            super(scoreFeedbackComponent);
            if (scoreFeedbackComponent == null) {
                return;
            }
            this.score_icon_list = Message.copyOf(scoreFeedbackComponent.score_icon_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public ScoreFeedbackComponent build(boolean z) {
            return new ScoreFeedbackComponent(this, z);
        }
    }

    public ScoreFeedbackComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ScoreIcon> list = builder.score_icon_list;
            if (list == null) {
                this.score_icon_list = DEFAULT_SCORE_ICON_LIST;
                return;
            } else {
                this.score_icon_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.score_icon_list = Message.immutableCopyOf(builder.score_icon_list);
    }
}