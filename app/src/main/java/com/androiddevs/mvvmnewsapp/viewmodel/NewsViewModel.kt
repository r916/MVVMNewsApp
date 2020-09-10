package com.androiddevs.mvvmnewsapp.viewmodel

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.repo.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

    
}