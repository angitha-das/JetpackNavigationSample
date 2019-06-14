/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

/**
 * Shows the main title screen.
 */
class TitleScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_title_screen, container, false)
        val playButton = view.findViewById<Button>(R.id.play_btn)


        //TODO STEP 1 - Navigate to a Destination with NavController
        playButton.setOnClickListener {
            findNavController().navigate(R.id.register, null)
        }
        // TODO END STEP 1

        //TODO STEP 2 - Set NavOptions
//        val options = navOptions {
//            anim {
//                enter = R.anim.slide_in_right
//                exit = R.anim.slide_out_left
//                popEnter = R.anim.slide_in_left
//                popExit = R.anim.slide_out_right
//            }
//        }
//        playButton.setOnClickListener {
//            findNavController().navigate(R.id.register, null, options)
//        }
        // TODO END STEP 2

        //TODO STEP 3 - Navigate using Navigation.createNavigateOnClickListener() to navigate
        // to the given destination with a bundle of arguments to be passed to the destination.
//        playButton.setOnClickListener ( Navigation.createNavigateOnClickListener(R.id.register, null))
        // TODO END STEP 3


        //TODO STEP 4 - navigate using an action
//        playButton.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_title_screen_to_register)
//        }
        // TODO END STEP 4

        //TODO STEP 5 - navigate using Safe Args Direction classes
//        playButton.setOnClickListener{
//            val action = TitleScreenDirections.actionTitleScreenToRegister()
//            findNavController().navigate(action)
//        }
        // TODO END STEP 5

        view.findViewById<Button>(R.id.leaderboard_btn).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_title_screen_to_leaderboard)
        }

        return view
    }
}
