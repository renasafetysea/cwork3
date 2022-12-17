package com.skypro.cwork3.impl;

import com.skypro.cwork3.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
