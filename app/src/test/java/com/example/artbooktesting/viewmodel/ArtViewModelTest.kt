package com.example.artbooktesting.viewmodel

import com.example.artbooktesting.repo.FakeArtRepository
import org.junit.Before

class ArtViewModelTest {

    private lateinit var viewModel: ArtViewModel

    @Before
    fun setup(){
        //Test Doubles

        viewModel= ArtViewModel(FakeArtRepository())
    }
}