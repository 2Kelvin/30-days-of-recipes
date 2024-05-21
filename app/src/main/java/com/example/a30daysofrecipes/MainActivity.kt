package com.example.a30daysofrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofrecipes.model.Recipe
import com.example.a30daysofrecipes.model.recipesList
import com.example.a30daysofrecipes.ui.theme._30DaysOfRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfRecipesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// one Recipe item component
@Composable
fun OneRecipe(recipe: Recipe, modifier: Modifier = Modifier) {
    ElevatedCard(modifier = modifier) {
        Column {
            Text( // day
                text = recipe.day.toString(),
                style = MaterialTheme.typography.labelSmall
            )
            Text( // Recipe name | title
                text = stringResource(id = recipe.name),
                style = MaterialTheme.typography.displayMedium
            )
            Box {// image
                Image(
                    painter = painterResource(id = recipe.img),
                    contentDescription = null
                )
            }
            Text( // description
                text = stringResource(id = recipe.desc),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
fun RecipePreview() {
    _30DaysOfRecipesTheme {
        OneRecipe(recipe = recipesList[0])
    }
}