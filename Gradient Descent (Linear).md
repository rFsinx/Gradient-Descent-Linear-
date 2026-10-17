# Sum of squared residuals

a quadratic function, leading coefficient > 0 $\implies$ its derivative = 0 $\Leftrightarrow$ its minimum
has convex paraboloid shape

$$
F(a, s) = \sum ((ax_i + s)-y_i)^2
$$

**Partial Derivatives**:

$$
\frac{\partial F}{\partial s} = \sum 2((ax_i + s) - y_i) \qquad \frac{\partial F}{\partial a} = \sum 2x_i((ax_i + s) - y_i)
$$

**Step SIze (using learning rate $\eta$):**

$$
s_{n+1} = s_n - \left. \frac{\partial F}{\partial s} \right |_{s = s_n} \cdot \eta \qquad a_{n+1} = a_n - \left. \frac{\partial F}{\partial a} \right |_{a = a_n} \cdot \eta
$$


## 2D Gradient Application

$$
\nabla F$ \text{ is a vector field (having vector outputs)} \qquad \implies \qquad \nabla F(a, s) = \frac{\partial F}{\partial a} \hat{i} + \frac{\partial F}{\partial s} \hat{j}
$$

**Vectorized Step Size ($\eta$):**

$$
\vec{x}_k = a_k \hat{i} + s_k \hat{j} (on as-plane) \qquad \implies \qquad goal: toward vertex's coordinate on as-plane)
$$

$$
\vec{x}_{k+1} = \vec{x}_k - \eta \nabla F(a_k, s_k)
$$
