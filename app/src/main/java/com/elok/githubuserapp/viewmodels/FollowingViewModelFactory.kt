package com.elok.githubuserapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.elok.githubuserapp.repository.GithubRepository

class FollowingViewModelFactory(
    private val githubRepository: GithubRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return FollowingViewModel(githubRepository) as T
    }
}