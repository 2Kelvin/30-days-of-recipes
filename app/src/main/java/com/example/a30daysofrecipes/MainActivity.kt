package com.example.a30daysofrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Column(modifier = Modifier.fillMaxWidth()) {
            Text( // day
                text = stringResource(id = recipe.day),
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(start = 5.dp, top = 10.dp)
            )
            Text( // Recipe name | title
                text = stringResource(id = recipe.name),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(start = 5.dp, bottom = 10.dp)
            )
            Box(modifier = Modifier.fillMaxWidth().height(300.dp)) {// image
                Image(
                    painter = painterResource(id = recipe.img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
            Text( // description
                text = stringResource(id = recipe.desc),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(start = 5.dp, top = 10.dp, bottom = 10.dp)
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