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
