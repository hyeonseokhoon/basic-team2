package camp.model;

import java.util.ArrayList;
import java.util.List;

public class Score {
    private String scoreId;
    private String studentId;
    private String subjectId;
    private List<ScoreDatail> scoreList;


    public Score(String seq, String studentId, String subjectId) {
        this.scoreId = seq;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.scoreList = new ArrayList<>();
    }
    public Score(String seq, String studentId, String subjectId, List<ScoreDatail> scoreList) {
        this.scoreId = seq;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.scoreList = scoreList;
    }

    // Getter
    public String getScoreId() {
        return scoreId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void addScore(ScoreDatail score) {
        this.scoreList.add(score);
    }

    public List<ScoreDatail> getScoreList() {
        return scoreList;
    }
}